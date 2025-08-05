package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size = random.nextInt(1, 99);
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(-99, 99);
            }

            int[] expectedResult = Arrays.stream(arr)
                    .filter(el -> el>=0)
                    .toArray();
            int[] actualResult = deleteNegative(arr);

            System.out.println("%s -> %s".formatted(Arrays.toString(arr), Arrays.toString(actualResult)));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }


    public
    static int[] deleteNegative(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] >= 0) {

                count++;

            }

        }

        int result[] = new int[count];

        count = 0;

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] >= 0) {

                result[count] = arr[i];

                count++;

            }

        }

        return result;

    }
}
