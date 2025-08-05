package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task5 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int testValue;
            boolean isTwoDigits = random.nextBoolean();

            if (i < 10 && i > 0) {
                isTwoDigits = false;
                testValue = i;
            } else {
                testValue = isTwoDigits ?
                        random.nextInt(10, 99) :
                        random.nextInt(100, 1000000);
            }

            boolean actualValue = is2Digits(testValue);

            System.out.println("%d -> %b".formatted(testValue, actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(isTwoDigits);
        }
    }


    public static boolean is2Digits(int x){
        return x > 9 && x < 100;
    }
}

