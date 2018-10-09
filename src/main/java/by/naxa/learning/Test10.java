package by.naxa.learning;

/**
 * Q: What will be the output when this code is compiled and run?
 * A: 20 20 20 20
 */
public class Test10 {
    public void Process(){
        synchronized (this) {

        }
    }

    public Test10() {
        Bar b = new Bar();
        Bar b1 = new Bar();
        update(b);
        update(b1);
        b1 = b;
        update(b);
        update(b1);
    }

    private void update(Bar bar) {
        bar.x = 20;
        System.out.print(bar.x + " ");
    }

    public static void main(String... args) {
        new Test10();
    }

    private class Bar {
        int x = 10;
    }
}