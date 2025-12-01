package at.tasks.loops;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task8 {
    @RepeatedTest(10)
    void runTest() {
        int x = new Random().nextInt(1, 10);
        System.out.println("Размер треугольника : %d".formatted(x));
        leftTriangle(x);
    }


    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
