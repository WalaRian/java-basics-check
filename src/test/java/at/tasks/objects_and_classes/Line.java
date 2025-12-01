package at.tasks.objects_and_classes;

public class Line {
    Point begin;
    Point end;

    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line (int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double getLineLength() {
        return Math.sqrt(Math.pow(begin.x - begin.y, 2) + Math.pow(end.x - end.y, 2));
    }

    public String toString() {
        return "Линия от " + begin.toString() + "до " + end.toString();
    }
}
