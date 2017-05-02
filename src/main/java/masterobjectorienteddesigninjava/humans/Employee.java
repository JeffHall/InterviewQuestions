package masterobjectorienteddesigninjava.humans;

public class Employee extends Human implements Workable {

    public Employee(String name, int age, int heightInInches, String eyeColor) {
        super(name, age, heightInInches, eyeColor);
    }

    public void speak() {
        System.out.println("speaking...");
    }

    public void walk() {
        System.out.println("Employee is walking...");
    }

    public void work() {
        System.out.println("working...");
    }
}
