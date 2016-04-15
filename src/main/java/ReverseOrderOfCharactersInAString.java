public class ReverseOrderOfCharactersInAString {

    /*
    Create an algorithm to reverse the order of words in a string.
    For example, if you have the string "I am happy that today is Friday",
    the method should accept that string as input and return:
    "Friday is today that happy am I"
     */

    public static void main(String args[]) {
        String switchThisStringAround = switchItAround("I am happy that today is Friday");
        System.out.println(switchThisStringAround);

    }

    private static String switchItAround(String input) {

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
