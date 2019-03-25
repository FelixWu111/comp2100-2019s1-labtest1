
public class Value extends Token {
    String value;

    public Value(String value) {
        this.value = value;
    }
    
    public String show() {
        return "VALUE " + value;
    }
}
