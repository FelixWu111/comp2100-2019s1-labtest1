
public class Parser {

    PseudoTokeniser _tokeniser;
    
    public Parser(PseudoTokeniser tokeniser) {
        _tokeniser = tokeniser;
    }

    public Exp parse() {

        if (_tokeniser.hasNext()) {
            if (_tokeniser.next().type == TokenType.LEFTBRACKET) {


            }
        }

        return null;
    }

}
