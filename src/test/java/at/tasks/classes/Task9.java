package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task9 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            boolean isTrue = random.nextBoolean();

            int a = 0;
            int b = 0;
            int c = 0;
            if (isTrue) {
                a = random.nextInt();
                b = a;
                c = a;
            } else {
                switch (random.nextInt(99999) % 5) {
                    case 0 -> {
                        a = random.nextInt();
                        b = random.nextInt();
                        c = random.nextInt();
                    }
                    case 1 -> {
                        a = random.nextInt();
                        b = random.nextInt();
                        c = a;
                    }
                    case 2 -> {
                        a = random.nextInt();
                        b = a;
                        c = random.nextInt();
                    }
                    case 3 -> {
                        b = random.nextInt();
                        a = b;
                        c = random.nextInt();
                    }
                    case 4 -> {
                        b = random.nextInt();
                        c = random.nextInt();
                        a = c;
                    }
                }
            }

            boolean actualValue = isEqual(a, b, c);
            System.out.println("%d, %d, %d -> %b".formatted(a, b, c, actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(isTrue);
        }
    }

    public static boolean isEqual (int a, int b, int c) {
        return (a == b) && (a == c);
    }
}
