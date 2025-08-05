package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task5 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            long x = (i % 10 != 0) ? random.nextLong(1, 999999) : i*i;
            int expectedResult = String.valueOf(x).length();
            int actualResult = numLen(x);

            System.out.println("%d -> %d".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static int numLen(long x) {

        int result = 0;

        while (x > 0) {

            result++;

            x = x / 10;

        }

        return result;

    }
}
