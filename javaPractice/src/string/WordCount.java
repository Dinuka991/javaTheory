package string;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello World How are you, I am fine. How about you? I am good. Thank you. I love you." +
                "I am good. Thank you. I love you. I am good. Thank you. I love you. I am good. Thank you. I love you." +
                " Shall we netflix and chill? I am good. Thank you. I love you. I am good. Thank you. I love you.";

        String[]  sentence = str.split("\\.");
        String[] words = str.split("[ \\-]");
        System.out.println(sentence.length);
        System.out.println(words.length);
    }
}
