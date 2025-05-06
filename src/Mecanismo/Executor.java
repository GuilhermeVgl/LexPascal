package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Executor {

    private final String captureComment = "\\/\\/.*|\\(\\*(?:.|\\s)*\\*\\)";
    private final String captureNumbers = "(?<!\\w)(?:-?\\d+(?:\\.\\d+)?)(?!\\w)";
    private final String captureLiteral = "'(?:[^']|'')*'";
    private final String captureWords   = "\\w+";
    private final String captureCharacters = "(?::=|>=|<=|<>|>|<|=|\\+|\\-|\\*|\\/|[:;,.()\\[\\]{}])";
    private final String captureIdentifier = "^[A-Za-z][A-Za-z0-9_]*$";
    private String capture;

    private BufferedReader reader;
    private ArrayList<String> bufferPrimario;
    private ArrayList<String> bufferSecundario;

    private HashMap<String, Token> tabelaSimbolosPrograma;
    private HashMap<String, Token> tabelaSimbolosLinguagem;
    private Definicoes definicoes;

    public Executor() {
        this.tabelaSimbolosLinguagem = new TabelaSimbolosLinguagem().getTabela();
        this.definicoes = new Definicoes();
        this.tabelaSimbolosPrograma = new HashMap<>();
    }

    private boolean IsNumber(String valor) {
        Pattern pattern = Pattern.compile(this.captureNumbers);
        Matcher matcher = pattern.matcher(valor);
        return matcher.find() == true;
    }

    private boolean IsLiteral(String valor) {
        Pattern pattern = Pattern.compile(this.captureLiteral);
        Matcher matcher = pattern.matcher(valor);
        return matcher.find() == true;
    }

    private boolean IsCharacter(String valor) {
        Pattern pattern = Pattern.compile(this.captureCharacters);
        Matcher matcher = pattern.matcher(valor);
        return matcher.find() == true;
    }

    private boolean IsIdentifier(String valor) {
        Pattern pattern = Pattern.compile(this.captureIdentifier);
        Matcher matcher = pattern.matcher(valor);
        return matcher.find() == true;
    }

    public void CarregarArquivo(String caminhoCompleto) {
        this.CarregarBufferPrimario(caminhoCompleto);
    }

    private void CarregarBufferPrimario(String caminhoCompleto) {
        this.reader = null;
        try {
            this.reader = new BufferedReader(new FileReader(caminhoCompleto));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void ProcessarBufferPrimario() {
        this.bufferPrimario = new ArrayList<>();
        try {
            String linha;
            while ((linha = this.reader.readLine()) != null) {
                bufferPrimario.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

    public void ImprimirBufferPrimario() {
        System.out.println("## Conteúdo do Buffer primário: ##");
        System.out.println("");
        for (String texto : this.bufferPrimario) {
            System.out.println(texto);
        }
        System.out.println("----------------------------------------");        
    }

    public void ProcessarBufferSecundario() {        
        this.capture = captureComment.concat("|")
            .concat(captureNumbers).concat("|")
            .concat(captureLiteral).concat("|")
            .concat(captureWords).concat("|")
            .concat(captureCharacters);

        this.bufferSecundario = new ArrayList<>();

        Pattern pattern = Pattern.compile(this.capture);

        for (String texto : bufferPrimario) {
            Matcher matcher = pattern.matcher(texto);
            while(matcher.find()){
                String lexema = matcher.group();
                if (this.bufferSecundario.contains(lexema) == false){
                    this.bufferSecundario.add(lexema);
                }
            }
        }
        bufferSecundario.removeIf(value -> value.startsWith("//") || value.startsWith("(*"));
    } 
    
    public void ImprimirBufferSecundario() {
        System.out.println("## Conteúdo do Buffer secundário: ##");
        System.out.println("");
        for (String texto : this.bufferSecundario) {
            System.out.println(texto);
        }
        System.out.println("----------------------------------------");        
    }

    public void AnalisarMontandoTabelaSimbolos() {
        if (this.bufferSecundario == null) return;
    
        for (String lexema : this.bufferSecundario) {
            Token token = identificarToken(lexema);
            this.tabelaSimbolosPrograma.put(lexema, token);
        }
    }
    
    private Token identificarToken(String lexema) {
        String lexemaLower = lexema.toLowerCase();
    
        if (this.tabelaSimbolosLinguagem.containsKey(lexemaLower)) {
            Token original = this.tabelaSimbolosLinguagem.get(lexemaLower);
            return new Token(
                original.getToken(),
                lexema,
                original.getTipo(),
                original.getDescricao(),
                original.getEndereco()
            );
        }
    
        if (IsNumber(lexema)) {
            return new Token(null, lexema, definicoes.getNumber(), "Número", 0);
        }
        if (IsLiteral(lexema)) {
            return new Token(null, lexema, definicoes.getLiteral(), "Literal", 0);
        }
        if (IsIdentifier(lexema)) {
            return new Token(null, lexema, definicoes.getIdentifier(), "Identificador", 0);
        }
        if (IsCharacter(lexema)) {
            return new Token(null, lexema, definicoes.getSimbol(), "Símbolo", 0);
        }
    
        return new Token(null, lexema, definicoes.getUndefined(), "Desconhecido", 0);
    }

    public void ImprimirTabelaSimbolosPrograma() {
        System.out.println("## Tabela de Símbolos do Programa: ##");
        System.out.println("");

        if (tabelaSimbolosPrograma == null || tabelaSimbolosPrograma.isEmpty()) {
            System.out.println("Tabela de símbolos do programa está vazia ou não foi processada.");
            System.out.println("Execute AnalisarMontandoTabelaSimbolos() primeiro.");
            System.out.println("----------------------------------------");
            return;
        }
    
        if (bufferSecundario == null) {
            System.out.println("Buffer secundário é nulo, não é possível imprimir em ordem.");
            System.out.println("----------------------------------------");
            return;
        }
    
        for (String lexema : bufferSecundario) {
            Token token = tabelaSimbolosPrograma.get(lexema);
            if (token != null) {
                System.out.println(token);
            } else {
                System.out.println("Lexema não encontrado na tabela de símbolos: " + lexema);
            }
        }
    
        System.out.println("----------------------------------------");
    }

}
