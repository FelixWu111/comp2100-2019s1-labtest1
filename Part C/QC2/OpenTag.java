
public class OpenTag extends Token {
    String value;

    public OpenTag(String value) {
        this.value = value;
    }
    
    public String show() {
        return "OPENTAG " + value;
    }
}
