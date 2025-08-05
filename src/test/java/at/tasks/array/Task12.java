package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task12 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size1 = random.nextInt(1, 19);
            int size2 = random.nextInt(1, 19);
            int[] arr = new int[size1];
            for (int j = 0; j < size1; j++) {
                arr[j] = random.nextInt(-99, 99);
            }

            int[] ins = new int[size2];
            for (int j = 0; j < size2; j++) {
                ins[j] = random.nextInt(-99, 99);
            }
            int pos = random.nextInt(0, size1 > 1 ? size1 - 1 : 1);
            List<Integer> list = new java.util.ArrayList<>(Arrays.stream(arr).boxed().toList());
            for (int j = 0; j < ins.length; j++) {
                list.add(pos + j, ins[j]);
            }
            int[] expectedValue = list.stream().mapToInt(value -> value).toArray();
            System.out.println(pos);
            int[] actualValue = add(arr, ins, pos);

            System.out.println("\n%s\n insert %s, at pos %d\n->%s\n".formatted(Arrays.toString(arr), Arrays.toString(ins), pos, Arrays.toString(actualValue)));
            Assertions.assertThat(actualValue)
                    .isEqualTo(expectedValue);
        }
    }


//    public static int[] add(int[] arr, int[] ins, int pos) {
//        int[] result = new int[arr.length + ins.length];
//
//        for (int i = 0; i < result.length; i++) {
//            if (i < pos) {
//                result[i] = arr[i];
//            } else if (i<pos+ins.length) {
//                result[i] = ins[i - pos];
//            } else {
//                result[i] = arr[i - ins.length];
//            }
//        }
//
//        return result;
//    }

    public
    static int[] add(int[] arr, int[] ins, int pos) {

        int newArray[] = new int[ arr.length +
                ins.length];

        for (int i = 0; i < pos; i++) {

            newArray[i] = arr[i];

        }

        for (int i = pos; i < pos +
                ins.length; i++) {

            newArray[i] = ins[i - ins.length];

        }

        for (int i = pos + ins.length; i <
                arr.length + ins.length; i++) {

            newArray[i] = arr[i - pos];

        }

        return
                newArray;

    }
}
