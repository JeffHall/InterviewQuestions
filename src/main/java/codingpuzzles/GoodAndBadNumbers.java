package codingpuzzles;

public final class GoodAndBadNumbers {

    protected static boolean goodNumbers(int num1, int num2) {
        Boolean condition1 = false;
        Boolean condition2 = false;
        Boolean happiness = false;

        if (num1 < 0 || num2 < 0) {
            condition1 = true;
        }

        if (num1 > 110 || num2 > 110) {
            condition2 = true;
        }

        if (condition1 && condition2) {
            happiness = true;
        }

        return happiness;
    }
}
