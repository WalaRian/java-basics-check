package at.tasks.stream_api;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Check {
    @Test
    void test() {
//            int counter = 0;
//            IntStream.range(0, 4).forEach(i -> counter += i);

        List<Integer> numbersList = asList(1, 2, 3, 4);

        IntStream.range(0, 4)
                .forEach(i ->
                        numbersList.add(numbersList.get(i) + i)
                );
        numbersList.forEach(System.out::println);

    }
}
