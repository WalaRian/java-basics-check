package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task6 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean isSum = random.nextBoolean();
            int
                    x = random.nextInt(-1000, 1000),
                    y = random.nextInt(-1000, 1000),
                    z = random.nextInt(-1000, 1000);

            if (isSum) {
                switch (random.nextInt(1, 1000) % 3) {
                    case 0 -> {
                        x = y + z;
                    }
                    case 1 -> {
                        y = x + z;
                    }
                    case 2 -> {
                        z = x + y;
                    }
                }
            } else {
                x = (y + z) * random.nextInt(2, 10);
//                x = 243;
//                y = 162;
//                z = -81;
            }

            boolean actualResult = sum3(x, y, z);
            System.out.println("%d, %d, %d -> %b".formatted(x, y, z, actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(isSum);
        }
    }

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (y + z == x) || (x + z == y);
    }

}
