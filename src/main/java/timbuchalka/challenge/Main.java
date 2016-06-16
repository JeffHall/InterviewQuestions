package timbuchalka.challenge;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        Window window1 = new Window(20, 12, false);
        Window window2 = new Window(20, 12, true);
        Table table = new Table();
        Chair chair = new Chair();

        Room theRoom = new Room(door, window1, table, chair);

        System.out.println("The height of the window is: " + window1.getHeight());
        theRoom.whatColorIsTheDoor();

    }

}
