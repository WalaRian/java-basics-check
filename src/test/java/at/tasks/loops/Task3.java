package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task3 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1, 21);
            String expectedResult = "0";
            for (int j = 2; j <= x; j+=2) {
                expectedResult = "%s %d".formatted(expectedResult, j);
            }
            String actualResult = chet(x);

            System.out.println("%d -> %s".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }

    }

    public static String chet(int x) {

        String result = "0";

        for (int i = 2; i <= x; i = i + 2) {

            result = result + " "
                    + i;

        }

        return result;

    }
}
