package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static java.lang.Math.abs;

public class Task3 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int arrayLength = random.nextInt(1, 20);
            int[] array = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                array[j] = random.nextInt(-99, 99);
            }
            int maxValue = Arrays.stream(array).boxed().max(Comparator.comparingInt(Math::abs)).orElseGet(null);
            int actualValue = maxAbs(array);

            System.out.println("%s -> %d".formatted(Arrays.toString(array), actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(maxValue);
        }
    }


    public static int maxAbs(int[] arr) {
        int maxAbs=Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int currentAbs=Math.abs(arr[i]);
            if (currentAbs>maxAbs){
                maxAbs=currentAbs;
            }
        }
        return maxAbs;

    }
}
