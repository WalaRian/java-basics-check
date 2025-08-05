package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task7 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            boolean isLimitsExceeded = random.nextBoolean();
            int leftBound = random.nextInt(9999);
            int rightBound = random.nextInt(9999);

            if (leftBound == rightBound) {
                rightBound++;
            }

            int num;

            if (isLimitsExceeded) {
                num = random.nextBoolean() ?
                        random.nextInt(Math.max(leftBound, rightBound) + 1, Math.max(leftBound, rightBound) + 1000) :
                        random.nextInt(Math.min(leftBound, rightBound) -1);
            } else {
                num = random.nextInt(Math.min(leftBound, rightBound), Math.max(leftBound, rightBound));
            }

            boolean actualValue  = isInRange(leftBound, rightBound, num);
            System.out.println("Bounds is [%d, %d]. Num is %d -> %b".formatted(leftBound, rightBound, num, actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(!isLimitsExceeded);
        }
    }


    public static boolean isInRange(int a, int b, int num){
        return (num >= a && num <= b) || ((num >= b && num <= a));
    }
}
