public enum TokenType {
	LIT (""),
	LEFTBRACKET ("("),
	RIGHTBRACKET (")"),
	MULTIPLY ("*"),
	DIVIDE ("/"),
	EXCLAMATION ("!");

	String value;

	TokenType(String value) {
		this.value = value;
	}
}