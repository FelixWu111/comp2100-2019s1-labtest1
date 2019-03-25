public class QC1Test {

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
        String[] sentences = {"Hello I am 42 years old.",
                              "I saw 99 red balloons today, but they flew away.",
                              "Hello! How are you?",
                              "493?!def22qw"};

        for(String sentence : sentences)
            parse(sentence);
    }

}
