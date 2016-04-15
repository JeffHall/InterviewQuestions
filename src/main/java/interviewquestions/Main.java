package interviewquestions;

import static java.lang.System.out;

public class Main {

    public static void main(String args[]) {
        String inputText = "I am happy that today is Friday";

        out.println("Original sentence is: " + inputText);
        out.println();
        out.println(ReverseWordOrder.reverseLetters(inputText));
        out.println(ReverseWordOrder.reverseWords(inputText));
    }

}
