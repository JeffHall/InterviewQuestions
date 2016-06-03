package timbuchalka.inheritance.challenge;

public class Jaguar extends Car {

    private String model;

    public String getModel() {
        return model;
    }

    public Jaguar(boolean isMoving, int speed, String currentDirection, int currentGear, String model) {
        super(isMoving, speed, currentDirection, currentGear);
        this.model = model;
    }

    public void accelerate(int rate) {
        setCurrentGear(getCurrentGear() + rate);
    }
}
