package timbuchalka.inheritance.challenge;


public class Vehicle {

    private boolean isMoving;
    private int speed;
    private String currentDirection;

    public boolean isMoving() {
        return isMoving;
    }

    public int getSpeed() {
        return speed;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(boolean isMoving, int speed, String currentDirection) {
        this.isMoving = isMoving;
        this.speed = speed;
        this.currentDirection = currentDirection;
    }

    public void startMoving() {
        isMoving = true;
    }

    public void stopMoving() {
        speed = 0;
        isMoving = false;
    }

    public void changeSpeed(int amount) {
        speed += amount;
    }

    public void changeDirection(String direction) {
        currentDirection = direction;
    }

}
