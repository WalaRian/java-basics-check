package at.tasks.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.*;

public class Task9 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int size = random.nextInt(1, 20);
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(-19, 19);
            }
            int x = (random.nextBoolean()) ?
                    random.nextInt(-19, 19) :
                    arr[random.nextInt(0, arr.length!=1 ? arr.length - 1 : 1)];
            List<Integer> list = new java.util.ArrayList<>(Arrays.stream(arr).boxed().toList());
            int[] expectedResult = list.stream().map(el -> {
                        if (el == x) {
                            int index = list.indexOf(el);
                            list.set(index, null);
                            return index;
                        } else {
                            return null;
                        }
                    })
                    .filter(Objects::nonNull)
                    .mapToInt(value -> value)
                    .toArray();
            int[] actualResult = findAll(arr, x);

            System.out.println("%s, %d -> %s".formatted(Arrays.toString(arr), x, Arrays.toString(actualResult)));
            Assertions.assertThat(actualResult)
                    .isEqualTo(expectedResult);
        }
    }

    public static int[] findAll(int[] arr, int x) {
        //количество вхождений числа x в исходный массив
        int count = 0;
        //перебираем исходный массив, считаем количество вхождений числа x
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        //создаём временный массив, размер - количество вхождений числа x в исходный массив
        int[] arrTemp = new int[count];
        //перебираем исходный массив, записываем во временный массив индексы вхождений числа x в исходный массив
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arrTemp[index] = i;
                index++;
            }
        }
        return arrTemp;
    }

}
