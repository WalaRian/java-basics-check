package at.tasks.loops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task6 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();
        equalNum(8910);

        for (int i = 0; i < 100; i++) {
            boolean expectedValue = random.nextBoolean();
            int x = 0;
            int randomDigit = random.nextInt(1, 9);

            if (expectedValue) {
                for (int j = 0; j < random.nextInt(1, 6); j++) {
                    x = Integer.parseInt("%s%d".formatted(String.valueOf(x), randomDigit));
                }
            } else {
                for (int j = 0; j < random.nextInt(2, 6); j++) {
                    randomDigit = randomDigit + 1;
                    x = Integer.parseInt("%s%d".formatted(String.valueOf(x), randomDigit));
                }
            }
            boolean actualResult = equalNum(x);

            System.out.println("%d -> %b".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedValue);
        }
    }


    public static boolean equalNum(int x) {
        if (x < 0) x = -x;
        if (x == 0) return true;

        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

}
