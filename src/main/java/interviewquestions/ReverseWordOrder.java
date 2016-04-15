package interviewquestions;

public final class ReverseWordOrder {

    /*
    Create an algorithm to reverse the order of words in a string.
    For example, if you have the string "I am happy that today is Friday",
    the method should accept that string as input and return:
    "Friday is today that happy am I"
     */

    protected static String reverseLetters(String sentence) {
        String outputString = new StringBuilder(sentence).reverse().toString();
        return outputString;
    }

    protected static String reverseWords(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.length() + 1);
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1);  // Strip trailing space
        return sb.toString();
    }

}
