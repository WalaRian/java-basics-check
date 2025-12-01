package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task8 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean expectedResult = random.nextBoolean();
            int x = random.nextInt(1, 999);
            if (expectedResult) {
                if (random.nextBoolean()) {
                    x = (x % 3 != 0) ? x*3 : x;
                    x = (x % 5 ==0) ? x+3: x;
                } else {
                    x = (x % 5 != 0) ? x*5 : x;
                    x = (x % 3 == 0) ? x+5 : x;
                }
            } else {
                if (random.nextBoolean()) {
                    while ((x % 3 ==0)||(x % 5 ==0)) {
                        x++;
                    }
                } else {
                    x = x*15;
                }
            }

            boolean actualResult = is35(x);
            System.out.println("%d -> %b".formatted(x, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    //Практика Java. Условия Задание #8
    public static boolean is35(int x) {
        boolean divisibleBy3 = (x % 3 == 0);
        boolean divisibleBy5 = (x % 5 == 0);

        if (divisibleBy3 && divisibleBy5) {
            return false;
        } else if (divisibleBy3 || divisibleBy5) {
            return true;
        } else {
            return false;
        }
    }
}
