package interviewquestions;

public final class ReverseOrderOfCharactersInAString {

    /*
    Create an algorithm to reverse the order of words in a string.
    For example, if you have the string "I am happy that today is Friday",
    the method should accept that string as input and return:
    "Friday is today that happy am I"
     */

    protected static String switchItAround(String input) {

        int arrayLength = input.length();
        char[] outputArray;
        outputArray = new char[arrayLength];
        char[] letters = input.toCharArray();
        int outputArrayPosition = 0;

        for (int i = arrayLength - 1; i >= 0; i--) {
            char currentLetter = letters[i];
            outputArray[outputArrayPosition] = currentLetter;
            outputArrayPosition++;
        }
        String outputString = new String(outputArray);
        return outputString;
    }

}
