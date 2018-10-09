package by.naxa.learning;

/**
 * Q: What is the result of an attempt to compile and run the given program?
 * A: It compiles, but throws {@link NullPointerException} at run-time.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        return (true ? null : 0);
    }
}
