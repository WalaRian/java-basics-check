package at.tasks.loops;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task7 {
    @RepeatedTest(10)
    void runTest() {
        int x = new Random().nextInt(1, 10);
        System.out.println("Длинна стороны квадрата : %d".formatted(x));
        square(x);
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
