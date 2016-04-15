package codingpuzzles;

public class Main {

    public static void main(String args[]) {
        // Coding puzzle 1
        // Both numbers are considered good if one is less than 0 and the other is greater than 110.
        Boolean happy = GoodAndBadNumbers.goodNumbers(-14, 113);
        if (happy) {
            System.out.println("We are happy");
        } else {
            System.out.println("We are not happy");
        }

    }

}
