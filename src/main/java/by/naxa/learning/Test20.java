package by.naxa.learning;

/**
 * Q: What is the output of the given console application?
 * A: -try-finally
 */
public class Test20 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        try {
            System.out.print("-try");
            return;
        } catch (Exception exc) {
            System.out.print("-catch");
        } finally {
            System.out.print("-finally");
        }
    }
}
