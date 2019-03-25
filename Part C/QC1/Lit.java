
public class Lit extends Token {
    int value;

    public Lit(int value) {
        this.value = value;
    }
    
    public String show() {
        return "LIT " + value;
    }
}
