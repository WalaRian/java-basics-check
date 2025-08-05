package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task1 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(0, 100);
            String expectedResult = "0";
            for (int j = 1; j <= x; j++) {
                expectedResult = "%s %d".formatted(expectedResult, j);
            }
            String actualResult = listNums(x);

            System.out.println("%d -> %s".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static String listNums(int x) {

        String result = "0";

        for (int i = 1; i <= x; i++) {

            result = result + " " +
                    i;

        }

        return result;

    }
}
