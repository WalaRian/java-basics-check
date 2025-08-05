package at.tasks.objects_and_classes;

import static java.lang.Math.pow;

public class Line {

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    public double getLength() {
        int diff = endPoint.x - startPoint.x;
        int diff1 = endPoint.y - startPoint.y;
        return Math.sqrt(diff * diff + diff1 * diff1);
    }

    @Override
    public String toString() {
        return "Линия от " + startPoint + " до " + endPoint;
    }
}
