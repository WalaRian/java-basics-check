package at.tasks.conditions;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class Task12 {
    @RepeatedTest(10)
    void runTest() {
        String day = getDayOfWeek(new Random().nextInt(1, 10));
//        day = day.substring(0, 1).toUpperCase() + day.substring(1);
        System.out.println(day);
        System.out.println("=========================================");
        printDays(day);
    }

    public static void printDays(String x) {
        if (x == null) {
            System.out.println("это не день недели");
            return;
        }

        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

private static String getDayOfWeek(int x) {
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
}
