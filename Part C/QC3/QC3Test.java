
public class QC3Test {

    private static PseudoTokeniser tokeniser;
    private static Parser parser;
    
    private static void parse(Token[] equation) {
        System.out.println("Parsing equation:");
        tokeniser.setBuffer(equation);
        Exp exp = parser.parse();
        if(exp == null) {
            System.out.println("Got an null expression.");
        } else {
            tokeniser.showTokens();
            System.out.println(" = " + exp.evaluate());
        }
    }
    
    public static void main(String[] args) {
        tokeniser = new PseudoTokeniser();
        parser = new Parser(tokeniser);
        
        Token[][] equations = {{new Token(TokenType.LEFTBRACKET), new Token(20), new Token(TokenType.MULTIPLY), new Token(30), new Token(TokenType.RIGHTBRACKET)},
                               {new Token(TokenType.LEFTBRACKET), new Token(TokenType.LEFTBRACKET), new Token(12), new Token(TokenType.DIVIDE), new Token(4), new Token(TokenType.RIGHTBRACKET), new Token(TokenType.MULTIPLY), new Token(6), new Token(TokenType.RIGHTBRACKET)},
                               {new Token(TokenType.EXCLAMATION), new Token(TokenType.LEFTBRACKET), new Token(6), new Token(TokenType.RIGHTBRACKET)},
                               {new Token(TokenType.EXCLAMATION), new Token(TokenType.LEFTBRACKET), new Token(TokenType.LEFTBRACKET), new Token(8), new Token(TokenType.DIVIDE), new Token(2), new Token(TokenType.RIGHTBRACKET), new Token(TokenType.RIGHTBRACKET)}
                              };
                              
        for(Token[] equation : equations)
            parse(equation);
    }

}
