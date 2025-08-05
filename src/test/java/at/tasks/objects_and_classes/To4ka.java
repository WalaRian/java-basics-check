package at.tasks.objects_and_classes;

public class To4ka {

    private int x;

    private int y;

    public To4ka(int x, int y) {

        this.x = x;

        this.y = y;

    }

    public String toString() {

        return "{" + x + ";" + y + "}";

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}