// A way to provide tokens without having to include tokeniser code
public class PseudoTokeniser {

	Token[] tokens;
	int count;

	public PseudoTokeniser() {
		count = 0;
	}

	public void setBuffer(Token[] tokens) {
		this.tokens = tokens;
		count = 0;
	}

	public Token next() {
		return count < tokens.length ? tokens[count] : null;
	}

	public Token takeNext()  {
		return count < tokens.length ? tokens[count++] : null;
	}

	public boolean hasNext() {
		return count < tokens.length;
	}

	public void showTokens() {
		for (Token t : tokens)
			System.out.print(t.show());
	}

}