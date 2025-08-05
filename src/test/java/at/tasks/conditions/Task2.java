package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task2 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1, 10000);
            int y = random.nextInt(0, 10);
            boolean isZero = y == 0;
            int actualResult = safeDiv(x, y);
            int expectedResult = isZero ? 0 : x/y;

            System.out.println("%d / %d = %d".formatted(x, y, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }

    public static int safeDiv(int x, int y){
        if (y == 0) {
            return 0;
        }
        return x / y;
    }
}
