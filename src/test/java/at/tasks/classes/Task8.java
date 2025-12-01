package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task8 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean isDivisor = random.nextBoolean();
            int firstDigit = random.nextInt(2, 999);
            int secondDigit = random.nextInt(2, 999);
            int result = firstDigit * secondDigit;

            if (!isDivisor) {
                result++;
            }

            int firstOp = 0;
            int secondOp = 0;

            switch (random.nextInt(1, 99999) % 4) {
                case 0 -> {
                    firstOp = firstDigit;
                    secondOp = result;
                }
                case 1 -> {
                    firstOp = secondDigit;
                    secondOp = result;
                }
                case 2 -> {
                    firstOp = result;
                    secondOp = firstDigit;
                }
                case 3 -> {
                    firstOp = result;
                    secondOp = secondDigit;
                }
            }
            System.out.println(isDivisor);

            boolean actualResult = isDivisor(firstOp, secondOp);
            System.out.println("%d %d -> %b".formatted(firstOp, secondOp, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(isDivisor);
        }
    }


//    public static boolean isDivisor (int a, int b) {
//        return ((double) a % b) == 0 || ((double) b % a) == 0;
//    }

    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }
}
