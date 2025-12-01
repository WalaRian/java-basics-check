package at.tasks.collections;

import org.junit.jupiter.api.RepeatedTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PairSwaps {
    @RepeatedTest(10)
    void testPairSwap() {
        int n = new Random().nextInt(2, 10);
        n = n % 2 != 0 ? n + 1 : n;
        createAndSwapList(n)
                .forEach(System.out::println);
    }


    public static List<Integer> createAndSwapList(int n) {
        ArrayList<Integer> arr= new ArrayList<>(n);

        for (int i = 1; i < n; i=i+2) {

            arr.add(i+1);
            arr.add(i);
        }

        return arr;
    }
}
