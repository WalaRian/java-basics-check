package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task4 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();
        for (int i = 1; i < 101; i++) {
            boolean coin = random.nextBoolean();
            int testInt = coin ? i : -i;
            boolean actualBool = isPositive(testInt);

            System.out.println("'%d' -> %b".formatted(testInt, actualBool));
            Assertions.assertThat(actualBool)
                    .isEqualTo(coin);
        }
    }

    public static boolean isPositive(int x) {
        return  x > 0;
    }
}
