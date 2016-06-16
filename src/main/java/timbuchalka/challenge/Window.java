package timbuchalka.challenge;

public class Window {

    private int height;
    private int width;
    private boolean opaque;

    public Window(int height, int width, boolean opaque) {
        this.height = height;
        this.width = width;
        this.opaque = opaque;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isOpaque() {
        return opaque;
    }
}
