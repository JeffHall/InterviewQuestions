package timbuchalka.challenge;

public class Room {

    private Door door;
    private Window window;
    private Table table;
    private Chair chair;

    public Room(Door door, Window window, Table table, Chair chair) {
        this.door = door;
        this.window = window;
        this.table = table;
        this.chair = chair;
    }

    public void whatColorIsTheDoor() {
        door.tellMeTheColorOfTheDoor();
    }
}
