package by.naxa.learning;

import java.util.Random;

/**
 * Q: Which of the following methods will generate five random numbers between 0 and 200?
 * A: {@code optionC()}
 */
public class Test17 {

    public static void main(String... args) {
        optionA();
        optionB();
        optionC();
        optionD();
    }

    private static void optionA() {
        Random r = new Random();
        for (int i = 0; i < 200; ++i) {
            System.out.print(" " + r.nextInt(i));
        }
        System.out.println();
    }

    private static void optionB() {
        Random r = new Random(200);
        for (int i = 0; i < 5; ++i) {
            System.out.print(" " + r.nextInt());
        }
        System.out.println();
    }

    private static void optionC() {
        Random r = new Random();
        for (int i = 0; i < 5; ++i) {
            System.out.print(" " + r.nextInt(200));
        }
        System.out.println();
    }

    private static void optionD() {
        Random r = new Random(200);
        for (int i = 0; i < 5; ++i) {
            System.out.print(" " + r.nextInt(0));
        }
        System.out.println();
    }

}
