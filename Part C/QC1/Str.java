
public class Str extends Token {
    String value;

    public Str(String value) {
        this.value = value;
    }
    
    public String show() {
        return "STR " + value;
    }
}
