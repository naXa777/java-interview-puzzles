package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: true; false; false; false; false; false; true.
 */
public class Test12 {
    public static void main(String[] args) {
        Integer x = 0;
        Integer y = 0;
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        Integer e = 255;
        Integer f = 255;
        Integer g = 256;
        Integer h = 256;
        Integer i = 512;
        Integer j = 512;
        Integer k = new Integer(0);
        Integer l = new Integer(0);
        System.out.println((a == b) + "; " + (c == d) + "; " + (e == f) + "; " + (g == h) + "; " + (i == j) + "; " + (k == l) + "; " + (x == y) + ".");
    }
}
