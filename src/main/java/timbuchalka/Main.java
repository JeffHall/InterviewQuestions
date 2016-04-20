package timbuchalka;

public class Main {

    public static void main(String[] args) {
//        calcFeetAndInchesToCentimeters(6, 0);
//        calcFeetAndInchesToCentimeters(7, 5);
//        calcFeetAndInchesToCentimeters(-10, 1);
//        calcFeetAndInchesToCentimeters(0, 1);
//        calcFeetAndInchesToCentimeters(6, 13);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double totalInches = ((12d * feet) + inches);
            double centimeters = (2.54d * totalInches);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12d);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
