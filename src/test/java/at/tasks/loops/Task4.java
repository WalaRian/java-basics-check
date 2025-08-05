package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task4 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1, 10);
            int y = random.nextInt(0, 10);
            int expectedResult =(int) Math.pow(x, y);
            int actualResult = pow(x, y);

            System.out.println("%d^%d -> %d".formatted(x, y, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static int pow(int x, int y) {

        int result = 1;

        for (int i = 0; i < y; i++) {

            result *= x;

        }

        return result;

    }
}
