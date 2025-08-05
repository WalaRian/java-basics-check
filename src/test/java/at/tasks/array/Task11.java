package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task11 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size = random.nextInt(1, 19);
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(-99, 99);
            }
            int x = random.nextInt(-99, 99);
            int pos = random.nextInt(0, size > 1 ? size - 1 : 1);
            List<Integer> list = new java.util.ArrayList<>(Arrays.stream(arr).boxed().toList());
            list.add(pos, x);
            int[] expectedValue = list.stream().mapToInt(value -> value).toArray();
            int[] actualValue = add(arr, x, pos);

            System.out.println("\n%s, insert %d, at pos %d\n->%s\n".formatted(Arrays.toString(arr), x, pos, Arrays.toString(actualValue)));
            Assertions.assertThat(actualValue)
                    .isEqualTo(expectedValue);
        }
    }


    public
    static int[] add(int[] arr, int x, int pos) {

        int newArray[] = new int[ arr.length +
                1];

        for (int i = 0; i < pos; i++) {

            newArray[i] = arr[i];

        }

        newArray[pos] = x;

        for (int i = pos; i < arr.length;
             i++) {

            newArray[i + 1] = arr[i];

        }

        return newArray;

    }

//    public static int[] add(int[] arr, int x, int pos) {
//        int[] result = new int[arr.length + 1];
//
//        for (int i = 0; i < result.length; i++) {
//            if (i < pos) {
//                result[i] = arr[i];
//            } else if (i == pos) {
//                result[i] = x;
//            } else {
//                result[i] = arr[i - 1];
//            }
//        }
//
//        return result;
//    }
}
