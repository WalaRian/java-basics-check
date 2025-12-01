package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task1 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean coin = random.nextBoolean();
            int value = coin ?
                    random.nextInt(1, 10000) :
                    random.nextInt(-10000, -1);
            int actualValue = abs(value);
            int expectedValue = Math.abs(value);
            System.out.println("%d -> %d".formatted(value, actualValue));

            Assertions.assertThat(actualValue)
                    .isEqualTo(expectedValue);
        }
    }

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}
