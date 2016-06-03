package timbuchalka.inheritance.challenge;

public class Main {

    public static void main(String[] args) {

        Jaguar jaguar = new Jaguar(false, 0, "NW", 0, "F-Type");

        getCurrentStatus(jaguar);

        jaguar.startMoving();
        jaguar.setCurrentGear(1);
        jaguar.changeSpeed(5);
        jaguar.changeDirection("NE");

        getCurrentStatus(jaguar);

        jaguar.setCurrentGear(2);
        jaguar.changeSpeed(10);

        getCurrentStatus(jaguar);

        jaguar.setCurrentGear(3);
        jaguar.changeSpeed(15);
        jaguar.changeDirection("SE");

        getCurrentStatus(jaguar);

        jaguar.accelerate(1);

        getCurrentStatus(jaguar);

        jaguar.stopMoving();

        getCurrentStatus(jaguar);
    }

    private static void getCurrentStatus(Jaguar j) {
        if(j.isMoving()) {
            System.out.println("Jaguar model " + j.getModel() + " is moving in a " + j.getCurrentDirection() + " direction at a speed of " + j.getSpeed() + " mph while in gear #" + j.getCurrentGear());
        } else {
            System.out.println("Jaguar model " + j.getModel() + " is not moving.");
        }

    }

}
