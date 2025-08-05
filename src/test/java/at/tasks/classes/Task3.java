package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task3 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int testDigit = random.nextInt(0, 9);
            char testChar = Character.forDigit(testDigit, 10);
            int actualDigit = charToNum(testChar);

            System.out.println("'%c' -> %d".formatted(testChar, actualDigit));
            Assertions.assertThat(actualDigit)
                    .isEqualTo(testDigit);
        }
    }

    public static int charToNum(char x) {
        return (int) x - 48;
    }
}
