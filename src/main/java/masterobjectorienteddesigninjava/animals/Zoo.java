package masterobjectorienteddesigninjava.animals;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal(14, "M", 280);
        Animal animal2 = new Animal(7, "F", 16);
        Animal animal3 = new Animal(89, "F", 124);

        animal1.eat();
        animal2.sleep();
        animal3.eat();

        Bird bird1 = new Bird();
        Fish fish1 = new Fish();

        bird1.fly();
        fish1.swim();

    }

}
