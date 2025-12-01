package at.tasks.loops;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        guessGame();
        guessGame();
        guessGame();
    }
    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x =0;
        int attempts=0;

        do
        {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            attempts++;

            if (x != randomNum) {
                System.out.println("No, try again");
            }

        } while (x != randomNum);

        System.out.println("Yes, it`s " + randomNum);
        System.out.println("Attempts: "+ attempts);
    }
}
