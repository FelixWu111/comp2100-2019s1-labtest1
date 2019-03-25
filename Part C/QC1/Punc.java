
public class Punc extends Token {
	public enum Punctuation {
		FULLSTOP ("."),
		COMMA (","),
		QUESTION ("?"),
		EXCLAMATION ("!"),
		COLON (":"),
		SEMICOLON (";");

		String symbol;

		Punctuation(String s) {
			symbol = s;
		}
	}

    Punctuation value;

    public Punc(Punctuation value) {
        this.value = value;
    }
    
    public String show() {
        return "PUNC" + value.symbol;
    }
}
