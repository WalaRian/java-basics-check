package at.tasks.objects_and_classes;

import org.junit.jupiter.api.Test;

public class PointTask {
    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "{" + x +";" + y +'}';
        }
    }

    @Test
        void test1() {
            Point p1 = new Point(1,3);
            Point p2 = new Point(1,3);
            Point p3 = new Point(5,8);
            System.out.print(p1 + " " + p2 + " " + p3 + " ");
            System.out.println();
            System.out.println(p1==p2);
            System.out.println(p2==p3);
            System.out.println(p1==p3);
        }
}
