package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task7 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(-100, 100);
            int y = random.nextInt(-100, 100);

            if (random.nextBoolean()) {
                x = random.nextInt(1, 19);
                y = (x < 10) ? random.nextInt(1, 11-x) : random.nextInt(1, 20 - x);
            }

            int expectedValue = ((x+y) < 10 || (x+y) > 19) ? x+y : 20;
            int actualValue = sum2(x, y);
            System.out.println("%d, %d -> %d".formatted(x, y, actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(expectedValue);
        }
    }


    //Практика Java. Условия Задание #7
//    public static int sum2(int x, int y) {
//        int sum = x + y;
//        if (sum >= 10 && sum <= 19) return 20;
//        return sum;
//    }

    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }
}
