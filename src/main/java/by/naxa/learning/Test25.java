package by.naxa.learning;

/**
 * Q: What will be the output of the following code?
 * A: -Jav-a 8-
 */
public class Test25 {

    public static void main(String... args) {
        StringBuilder sb = new StringBuilder("Java 8");

        sb.insert(6,"-");
        sb.insert(0,"-");
        sb.insert(4,"-");
        System.out.println(sb);
    }
}
