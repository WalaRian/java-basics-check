package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task2 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(0, 100);
            String expectedResult = String.valueOf(x);
            for (int j = x - 1; j >= 0; j--) {
                expectedResult = "%s %d".formatted(expectedResult, j);
            }
            String actualResult = reverseListNums(x);

            System.out.println("%d -> %s".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }

    public static String reverseListNums(int x)
    {

        String result = String.valueOf(x);

        for (int i = x-1; i >= 0; i--) {

            result = result + " " +
                    i;

        }

        return result;

    }
}
