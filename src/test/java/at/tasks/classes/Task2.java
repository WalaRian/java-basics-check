package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task2 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 1; i < 101; i++) {
            int lastDigit = random.nextInt(0, 9);
            int preLastDigit = random.nextInt(0, 9);
            int expectedInt = lastDigit + preLastDigit;
            int resultInt = preLastDigit* 10 + lastDigit;

            for (int j = 2; j < random.nextInt(3, 6); j++) {
                resultInt = (int) (resultInt + random.nextInt(1, 9) * Math.pow(10, j));
            }

            System.out.println("%d -> %d".formatted(resultInt, sumLastNums(resultInt)));
            Assertions.assertThat(sumLastNums(resultInt))
                    .isEqualTo(expectedInt);
        }
    }

    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }
}
