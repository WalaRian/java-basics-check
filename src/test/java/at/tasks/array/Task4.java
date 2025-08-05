package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {
    @RepeatedTest(10)
    void runTests() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int arrayLength = random.nextInt(1, 20);
            int[] array = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                array[j] = random.nextInt(-99, 99);
            }
            int expectedValue = Arrays.stream(array).boxed()
                    .filter(element -> element > 0)
                    .toList().size();
            int actualValue = countPositive(array);

            System.out.println("%s -> %d".formatted(Arrays.toString(array), actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(expectedValue);
        }
    }

    public static int countPositive(int[] arr)
    {

        int count=0;

        for (int i = 0; i < arr.length; i++)
        {


            if
            (arr[i]>0) {


                count++;

            }

        }

        return count;

    }
}
