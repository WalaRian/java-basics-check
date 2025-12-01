package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean isArrayContainsValue = random.nextBoolean();
            int value = random.nextInt(0, 99);
            int arrayLength = random.nextInt(1, 13);
            int[] array = new int[arrayLength];
            int position = -1;
            if (isArrayContainsValue) {
                for (int j = 0; j < arrayLength; j++) {
                    if (j % 2 == 0) {
                        array[j] = value > 1 ? random.nextInt(0, value - 1) : 0;
                    } else {
                        array[j] = value < 98 ? random.nextInt(value + 1, 99) : 99;
                    }
                }
                position = random.nextInt(0, array.length);
                array[position] = value;
            } else {
                for (int j = 0; j < arrayLength; j++) {
                    if (j % 2 == 0) {
                        array[j] = value > 1 ? random.nextInt(0, value - 1) : 0;
                    } else {
                        array[j] = value < 98 ? random.nextInt(value + 1, 99) : 99;
                    }
                }
            }
            position = Arrays.stream(array).boxed().toList().indexOf(value);
            int actualResult = findFirst(array, value);

            System.out.println("%s %d -> %d".formatted(Arrays.toString(array), value, actualResult));

            Assertions.assertThat(actualResult)
                    .isEqualTo(position);
        }
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;

    }
}
