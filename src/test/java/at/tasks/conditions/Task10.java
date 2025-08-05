package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task10 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String expectedResult = "";
            int x = random.nextInt(100, 9999);
            switch (random.nextInt(1, 9999) % 3) {
                case 0 -> {
                    x = x - (x % 100) + 1;
                    x = (random.nextBoolean()) ? x+(random.nextInt(2, 9)*10) : x;
                    expectedResult = "%dгод".formatted(x);
                }
                case 1 -> {
                    x = x - (x % 100) + random.nextInt(2,4);
                    x = (random.nextBoolean()) ? x+(random.nextInt(2, 9)*10) : x;
                    expectedResult = "%dгода".formatted(x);
                }
                case 2 -> {
                    x = x - (x % 100);
                    if (random.nextBoolean()) {
                        x = (random.nextBoolean()) ? x + 11 : x + random.nextInt(12,14);
                    } else {
                        x = (random.nextBoolean()) ? x+(random.nextInt(1, 9)*10) : x;
                        x = random.nextBoolean() ? x + random.nextInt(5, 9) : x;
                    }

                    expectedResult = "%dлет".formatted(x);
                }
            }

            String actualResult = age(x).toLowerCase();
            System.out.println("%d -> %s".formatted(x, actualResult));
            Assertions.assertThat(actualResult.replace(" ", ""))
                    .isEqualTo(expectedResult);
        }

    }


    public static String age(int x){

        int m = x % 10;

        int n = x % 100;

        if (m == 1 && n != 11) {

            return x + " год";

        } else if ((m >= 2 && m <= 4) && (n < 10 || n > 20)) {

            return x + " года";

        } else {

            return x + " лет";

        }

    }

}
