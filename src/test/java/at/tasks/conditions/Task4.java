package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task4 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int
                    x = random.nextInt(),
                    y = random.nextInt();
            if (x % 10 == 0) {
                x = y;
            }

            String expectedResult = "%dIF%d".formatted(x, y);
            if (x > y) {
                expectedResult = expectedResult.replace("IF", ">");
            } else if (y > x) {
                expectedResult = expectedResult.replace("IF", "<");
            } else {
                expectedResult = expectedResult.replace("IF", "==");
            }

            String actualResult = makeDecision(x, y);
            System.out.println("%d %d -> %s".formatted(x, y, actualResult));
            Assertions.assertThat(actualResult.replace(" ", "").replace("\"", ""))
                    .isEqualTo(expectedResult);
        }
    }

    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }
}
