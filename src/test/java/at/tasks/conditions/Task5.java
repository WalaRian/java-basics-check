package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task5 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int
                    x = random.nextInt(),
                    y = random.nextInt(),
                    z = random.nextInt(),
                    expectedResult = Math.max(Math.max(x, y), z),
                    actualResult = max3(x, y, z);

            System.out.println("%d, %d, %d -> %d".formatted(x, y, z, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static int max3(int x, int y, int z){
        if ((x >= y) && (x >= z)) {
            return x;
        }
        if ((y >= x) && (y >= z)) {
            return y;
        }
        return z;
    };
}
