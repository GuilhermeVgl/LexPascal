package Factory;

import Mecanismo.Token;

public class TokenFactory {
    public static Token fromOriginalWithNewLexema(Token original, String novoLexema) {
        return new Token.Builder()
            .token(original.getToken())
            .lexema(novoLexema)
            .tipo(original.getTipo())
            .descricao(original.getDescricao())
            .endereco(original.getEndereco())
            .build();
    }
}
