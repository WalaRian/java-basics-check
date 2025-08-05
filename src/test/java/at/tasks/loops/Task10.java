package at.tasks.loops;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        guessGame();
        guessGame();
        guessGame();
    }
    static void guessGame() {

        int randomNum = 3;

        java.util.Scanner sc = new
                Scanner(System.in);

        System.out.println("What number am I thinking (0 to 9)? :");

        int x = sc.nextInt();

        int retryCount = 1;

        while (x != randomNum) {

            System.out.println("What number am I thinking (0 to 9)? :");

            x = sc.nextInt();

            retryCount++;

        }

        System.out.println("Yes, it`s" + randomNum);

                System.out.println("Попыток:  " + retryCount);

    }
}
