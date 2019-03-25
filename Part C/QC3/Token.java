
public class Token {

	TokenType type;
	Integer value;
    
    public Token(TokenType type) {
    	this.type = type;
    	this.value = null;
    }

    public Token(int value) {
    	this.type = TokenType.LIT;
    	this.value = value;
    }

    public String show() {
    	return type == TokenType.LIT ? "" + value : type.value;
    }
}
