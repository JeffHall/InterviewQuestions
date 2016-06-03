package timbuchalka.inheritance.challenge;

public class Car extends Vehicle {

    private int currentGear;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Car(boolean isMoving, int speed, String currentDirection, int currentGear) {
        super(isMoving, speed, currentDirection);
        this.currentGear = currentGear;
    }

}
