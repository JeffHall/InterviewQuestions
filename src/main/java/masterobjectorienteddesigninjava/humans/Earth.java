package masterobjectorienteddesigninjava.humans;

public class Earth {

    public static void main(String[] args) {

        Human human1 = new Human("Tom", 25, 76, "blue");
        Employee employee1 = new Employee("Joe", 28, 68, "green");

        human1.eat();
        human1.speak();
        human1.walk();

        employee1.eat();
        employee1.speak();
        employee1.walk();
        employee1.work();


    }

}
