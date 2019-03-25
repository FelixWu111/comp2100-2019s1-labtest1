
public class QC4Test {

    private static PseudoTokeniser tokeniser;
    private static Parser parser;
    
    private static void parse(Token[] equation) {
        System.out.println("Parsing equation:");
        tokeniser.setBuffer(equation);
        Bool bool = parser.parse();
        if(bool == null) {
            System.out.println("Got an null answer");
        } else {
            tokeniser.showTokens();
            System.out.println(" = " + bool.evaluate());
        }
    }
    
    public static void main(String[] args) {
        tokeniser = new PseudoTokeniser();
        parser = new Parser(tokeniser);
        
        Token[][] equations = {{new Token(TokenType.LEFTBRACKET), new Token(TokenType.TRUE), new Token(TokenType.AND), new Token(TokenType.FALSE), new Token(TokenType.RIGHTBRACKET)},
                               {new Token(TokenType.NOT), new Token(TokenType.LEFTBRACKET), new Token(TokenType.LEFTBRACKET), new Token(TokenType.TRUE), new Token(TokenType.OR), new Token(TokenType.FALSE), new Token(TokenType.RIGHTBRACKET), new Token(TokenType.RIGHTBRACKET)},
                               {new Token(TokenType.LEFTBRACKET), new Token(TokenType.NOT), new Token(TokenType.LEFTBRACKET), new Token(TokenType.TRUE), new Token(TokenType.AND), new Token(TokenType.TRUE), new Token(TokenType.RIGHTBRACKET), new Token(TokenType.OR), new Token(TokenType.LEFTBRACKET), new Token(TokenType.FALSE), new Token(TokenType.OR), new Token(TokenType.FALSE), new Token(TokenType.RIGHTBRACKET), new Token(TokenType.RIGHTBRACKET)}
                              };
                              
        for(Token[] equation : equations)
            parse(equation);
    }

}
