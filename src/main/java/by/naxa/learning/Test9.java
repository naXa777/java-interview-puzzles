package by.naxa.learning;

/**
 * Q: What would be the result of compiling and running the following code class?
 * A: The code will compile and print 2.
 */
public class Test9 {

    public static void main(String... args) {
        Test9 t = new Test9();
        t.start();
    }

    private void start() {
        int i = 2;
        int j = 3;
        int x = i & j;
        System.out.println(x);
    }
}
