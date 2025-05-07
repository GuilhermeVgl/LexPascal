package Util;


import java.util.ArrayList;
import java.util.List;

public class RemoveCommentBlockUtil {
    public static List<String> removerComentarios(List<String> linhas) {
        List<String> resultado = new ArrayList<>();
        boolean dentroBloco = false;

        for (String linha : linhas) {
            StringBuilder novaLinha = new StringBuilder();
            int i = 0;
            int len = linha.length();

            while (i < len) {
                if (!dentroBloco) {
                    if (i + 1 < len && linha.charAt(i) == '(' && linha.charAt(i + 1) == '*') {
                        dentroBloco = true;
                        i += 2;
                    } else if (i + 1 < len && linha.charAt(i) == '/' && linha.charAt(i + 1) == '/') {
                        break;
                    } else {
                        novaLinha.append(linha.charAt(i));
                        i++;
                    }
                } else {
                    if (i + 1 < len && linha.charAt(i) == '*' && linha.charAt(i + 1) == ')') {
                        dentroBloco = false;
                        i += 2;
                    } else {
                        i++;
                    }
                }
            }

            String limpa = novaLinha.toString().trim();
            if (!limpa.isEmpty()) {
                resultado.add(limpa);
            }
        }
        return resultado;
    }
}
