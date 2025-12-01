package at.tasks.loops;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task9 {
    @RepeatedTest(10)
    void runTest() {
        int x = new Random().nextInt(1, 9);

        System.out.println("Размер треугольника :%d".formatted(x));
        rightTriangle(x);
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
