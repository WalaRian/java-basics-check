package at.tasks.objects_and_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> pointsList = List.of(new Point(1, 2), new Point(3, 4), new Point(23, 91));
        PolyLine pl = new PolyLine(pointsList);
        ClosedPolyLine cpl = new ClosedPolyLine(pointsList);

        System.out.println(pl.getLength());
        System.out.println(cpl.getLength());
    }
}
