package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task7 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size = random.nextInt(1, 20);
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = random.nextInt(-99, 99);
            }
            List<Integer> list = new java.util.ArrayList<>(Arrays.stream(array).boxed().toList());
            Collections.reverse(list);
            int[] expectedResult = list.stream().mapToInt(value -> value).toArray();
            int[] actualResult = reverseBack(array);

            System.out.println("%s -> %s".formatted(Arrays.toString(array), Arrays.toString(actualResult)));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public static int[] reverseBack(int[] arr) {

        int n = arr.length;

        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {

            tmp[i] = arr[n - 1 - i]; // Заполняем массив с конца исходного массива

        }

        return tmp;

    }
}
