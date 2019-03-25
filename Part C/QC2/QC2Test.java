public class QC2Test {

    private static Tokenizer tokenizer;
    
    private static void parse(String sentence) {
        System.out.println("Tokenising: " + sentence);
        tokenizer.setBuffer(sentence);
        while(tokenizer.hasNext()) {
            Token t = tokenizer.takeNext();
            System.out.print(t.show() + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        tokenizer = new Tokenizer();
        String[] sentences = {"<HELLO>happy</WORLD>banana",
                              "<EMPTY></EMPTY>",
                              "Don'tParseThese>>Brackets </OKAY>"
                              };

        for(String sentence : sentences)
            parse(sentence);
    }

}
