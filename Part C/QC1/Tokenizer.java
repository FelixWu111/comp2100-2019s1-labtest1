public class Tokenizer {
    
    private String _buffer;

    // Inner class to encapsulate token and buffer information
    class TokenResult {
        int length;
        Token token;

        public TokenResult(Token t, int l) {
            token = t;
            length = l;
        }
    }
    
    public Tokenizer() {
        setBuffer("");
    }
    
    public Tokenizer(String buffer) {
        setBuffer(buffer);
    }
    
    public void setBuffer(String buffer) {
        _buffer = buffer;
    }
    
    // Method to extract next token
    private TokenResult nextToken() {
        _buffer = _buffer.trim(); // Remove whitespace
        if(_buffer.isEmpty())
            return null;
        char firstChar = _buffer.charAt(0);

        if (firstChar == '.') return new TokenResult(new Punc(Punc.Punctuation.FULLSTOP), 1);
        if (firstChar == ',') return new TokenResult(new Punc(Punc.Punctuation.COMMA), 1);
        
        // TODO: Finish this method   

        return null;
    }

    // Return the next token in the buffer (without removing it)
    public Token next() {
        TokenResult nextResult = nextToken();
        return nextResult == null ? null : nextResult.token;
    }

    // Return the next token and remove it from the buffer
    public Token takeNext() {

        TokenResult nextResult = nextToken();
        if (nextResult == null)
            return null;

        _buffer = _buffer.substring(nextResult.length);
        return nextResult.token;
    }

    // Return whether is another token to parse in the buffer
    public boolean hasNext() {
        return nextToken() != null;
    }
}