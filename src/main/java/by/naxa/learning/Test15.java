package by.naxa.learning;


/**
 * Q: What is the output of the given code?
 * A: 2332
 */
public class Test15 {

    public static void main(String[] args) {
        VO a = new VO(2);
        VO b = new VO(3);
        swapONE(a, b);
        print(a, b);
        swapTWO(a, b);
        print(a, b);
        System.out.println();
    }

    private static void print(VO a, VO b) {
        System.out.print(a.toString() + b.toString());
    }

    private static void swapONE(VO a, VO b) {
        VO tmp = a;
        a = b;
        b = tmp;
    }

    private static void swapTWO(VO a, VO b) {
        int tmp = a.x;
        a.x = b.x;
        b.x = tmp;
    }
}

class VO {
    int x;

    VO(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.valueOf(x);
    }
}