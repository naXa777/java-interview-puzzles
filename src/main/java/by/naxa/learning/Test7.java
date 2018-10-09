package by.naxa.learning;

/**
 * Q: How many objects are created by the following code inside {@code main()}?
 * A: 2
 */
public class Test7 {
    public static void main(String... args) {
        Object a, b, c, d, e;
        e = new Object();
        b = a = e;
        e = new Object();
    }
}
