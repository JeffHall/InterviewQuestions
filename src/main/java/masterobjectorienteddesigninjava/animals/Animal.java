package masterobjectorienteddesigninjava.animals;

public class Animal {

    private int age;
    private String gender;
    private int weight;

    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected void eat() {
        System.out.println("Animal is eating...");
    }

    protected void sleep() {
        System.out.println("Animal is sleeping...");
    }


}
