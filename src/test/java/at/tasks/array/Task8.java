package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Task8 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size1 = random.nextInt(1, 10);
            int size2 = random.nextInt(1, 10);
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];

            for (int j = 0; j < size1; j++) {
                arr1[j] = random.nextInt(-99, 99);
            }
            for (int j = 0; j < size2; j++) {
                arr2[j] = random.nextInt(-99, 99);
            }

            int[] expectedResult = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).mapToInt(value -> value).toArray();
            int[] actualResult = concat(arr1, arr2);

            System.out.println("\n%s + %s \n-> %s\n".formatted(Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(actualResult)));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        //создаём временный массим размером как два исходных
        int[] arrTemp = new int[arr1.length + arr2.length];
        //перемменая хранящая индекс текущего элемента временного массива
        int index = 0;
        //перебираем первый массив и записываем его значения во временный массим
        for (int i = 0; i < arr1.length; i++) {
            arrTemp[index] = arr1[i];
            index++;
        }
        //перебираем второй массив и записываем его значения во временный массим
        for (int i = 0; i < arr2.length; i++) {
            arrTemp[index] = arr2[i];
            index++;
        }
        return arrTemp;
    }
}
