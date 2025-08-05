package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task3 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt();
            int y = random.nextInt();
            int expectedResult = Math.max(x, y);
            int actualResult = max(x, y);

            System.out.println("[%d, %d] -> %d".formatted(x, y, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static int max(int x, int y){
        if (x > y) return x;
        return y;
    }
}
