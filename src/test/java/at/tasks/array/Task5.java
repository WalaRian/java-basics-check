package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean expectedResult = random.nextBoolean();
            int size = random.nextInt(1, 20);
            int[] array = new int[size];
            if (expectedResult) {
                for (int j = 0; j < size / 2; j++) {
                    array[j] = random.nextInt(-99, 99);
                    array[size - 1 - j] = array[j];
                }
                if (size % 2 == 1) {
                    array[size / 2] = random.nextInt(-99, 99);
                }
            } else {
                if (size == 1) {
                    size = random.nextInt(5, 20);
                    array = new int[size];
                }
                for (int j = 0; j < size; j++) {
                    array[j] = random.nextInt(-99, 99);
                }
            }

            boolean actualResult = palindrom(array);
            System.out.println("%s -> %b".formatted(Arrays.toString(array), actualResult));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static boolean palindrom(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (Math.abs(arr[first])!=Math.abs(arr[last]) ){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
