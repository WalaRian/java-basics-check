package at.tasks.conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task11 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1, 10);
            String expectedResult = getExpectedResult(x);

            String actualResult = day(x);
            System.out.println("%d -> %s".formatted(x, actualResult));
            Assertions.assertThat(actualResult.toLowerCase())
                    .isEqualTo(expectedResult);
        }
    }

    private static String getExpectedResult(int x) {
        String expectedResult;
        switch (x) {
            case 1 -> expectedResult = "понедельник";
            case 2 -> expectedResult = "вторник";
            case 3 -> expectedResult = "среда";
            case 4 -> expectedResult = "четверг";
            case 5 -> expectedResult = "пятница";
            case 6 -> expectedResult = "суббота";
            case 7 -> expectedResult = "воскресенье";
            default -> expectedResult = "это не день недели";
        }
        return expectedResult;
    }


    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

}
