
public class CloseTag extends Token {
    String value;

    public CloseTag(String value) {
        this.value = value;
    }
    
    public String show() {
        return "CLOSETAG " + value;
    }
}
