package by.naxa.learning;

/**
 * Q: What will be the output of this program?
 * A: 4
 */
public class Test6 {

    public static void main(String args[]) {
        int a, b;
        a = 2;
        b = 0;
        System.out.println(g(a, new int[]{b}));
    }

    private static int g(int a, int b[]) {
        b[0] = 2 * a;
        return b[0];
    }
}
