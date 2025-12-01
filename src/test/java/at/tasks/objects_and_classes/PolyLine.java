package at.tasks.objects_and_classes;

import java.util.Arrays;

public class PolyLine {
    Point[] pointArray;

    public PolyLine() {
        this.pointArray = new Point[0];
    }

    public PolyLine(Point[] pointArray) {
        this.pointArray = Arrays.copyOf(pointArray, pointArray.length);
    }

    public Line[] getLines() {
        Line[] lineArray = new Line[pointArray.length - 1];

        for (int i = 0; i < lineArray.length; i++) {
            lineArray[i] = new Line(pointArray[i], pointArray[i+1]);
        }

        return lineArray;
    }

    public double getLength() {
        double length = 0;
        Line[] linesArray = getLines();

        for (int i = 0; i < linesArray.length; i++) {
            length = length + linesArray[i].getLineLength();
        }

        return length;
    }

    @Override
    public String toString() {
        return "";
    }
}
