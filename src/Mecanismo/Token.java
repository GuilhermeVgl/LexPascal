package Mecanismo;

public class Token {

    private String token;
    private String lexema;
    private String tipo;
    private String descricao;

    private int endereco;

    private Token(Builder builder) {
        this.token = builder.token;
        this.lexema = builder.lexema;
        this.tipo = builder.tipo;
        this.descricao = builder.descricao;
        this.endereco = builder.endereco;
    }

    public static class Builder {
        private String token;
        private String lexema;
        private String tipo;
        private String descricao;
        private int endereco;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder lexema(String lexema) {
            this.lexema = lexema;
            return this;
        }

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder endereco(int endereco) {
            this.endereco = endereco;
            return this;
        }

        public Token build() {
            return new Token(this);
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public Token() {
    }

    public Token(String token, String lexema, String tipo, String descricao, int endereco) {
        this.token = token;
        this.lexema = lexema;
        this.tipo = tipo;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Token [token=" + token + ", lexema=" + lexema + ", tipo=" + tipo + ", descricao=" + descricao
                + ", endereco=" + endereco + "]";
    }
}
