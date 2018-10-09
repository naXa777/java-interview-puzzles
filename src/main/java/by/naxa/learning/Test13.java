package by.naxa.learning;

import java.util.*;

/**
 * Q: Which sequence will be printed when the following program is run?
 * A: [1, 3, 2]
 */
public class Test13 {

    public static void main(String... args) {
        List l = new ArrayList();
        l.add("1");
        l.add("2");
        l.add(1, "3");
        System.out.println(l);
    }

}
