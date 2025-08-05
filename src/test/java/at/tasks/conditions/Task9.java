package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task9 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean expectedResult = random.nextBoolean();
            int x = random.nextInt(1, 9999);
            int y = random.nextInt(1, 9999);

            if (expectedResult) {
                switch (random.nextInt(1, 9999) % 3) {
                    case 0 -> {
                        if (random.nextBoolean()) {
                            x = 6;
                            y = random.nextInt();
                        } else {
                            y = 6;
                            x = random.nextInt();
                        }
                    }
                    case 1 -> {
                        x = random.nextInt(0, 6);
                        y = 6 - x;
                    }

                    case 2 -> {
                        x = random.nextInt(1, 9999);
                        y = 6 + x;
                    }
                }
            } else {
                x = random.nextInt(7, 12);
                y = random.nextInt(24, 99);
            }

            boolean actualResult = magic6(x, y);
            System.out.println("%d, %d -> %b".formatted(x, y, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static boolean magic6(int x, int y) {
        if ((x == 6) || (y == 6) || (x + y == 6) || (Math.abs(x - y) == 6)){
            return true;
        }
        return false;
    }
}
