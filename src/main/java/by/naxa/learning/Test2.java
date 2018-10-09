package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: f#
 */
public class Test2 {
    private int x = 0;

    public static void main(String[] args) {
        new Test2().test();
    }

    private int f(int x) {
        return ++x;
    }

    private int g(int y) {
        return x++;
    }

    private void test() {
        System.out.print(f(x) == f(x) ? "f" : "#");
        System.out.print(g(x) == g(x) ? "g" : "#");
    }
}
