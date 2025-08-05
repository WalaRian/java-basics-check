package at.tasks.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task6 {
    @RepeatedTest(10)
    void runTest() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean isLetterBig = random.nextBoolean();
            char testChar = (char) (isLetterBig ?
                    random.nextInt(26) + 'A' :
                    random.nextInt(26) + 'a');
            boolean actualValue = isUpperCase(testChar);

            System.out.println("%c -> %b".formatted(testChar, actualValue));
            Assertions.assertThat(actualValue)
                    .isEqualTo(isLetterBig);
        }
    }


    public static boolean isUpperCase(char x){
        return x >= 'A' && x <= 'Z';
    }
}
