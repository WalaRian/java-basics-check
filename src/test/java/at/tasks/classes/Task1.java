package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task1 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            double testDigit = random.nextDouble(1000);
            double decimalPart = (double) Math.round(testDigit % 1 * 1000) / 1000;
            double actualData = fraction(testDigit);

            System.out.println("Decimal part=%f, testDigit=%f\n%f -> %f".formatted(decimalPart, testDigit, testDigit, actualData));
            Assertions.assertThat(actualData)
                    .isEqualTo(decimalPart);
        }
    }


    public static double fraction(double x){

        int num = (int) x;

        System.out.println(num);

        return Math.round((x - num) * 100d) / 100d;

    }

}
