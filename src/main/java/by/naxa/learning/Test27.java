package by.naxa.learning;

/**
 * Q: What will be the output of the following program?
 * A: Hello World
 * Finally executing
 */
class Test27 {

    public static void main(String... args) {
        try {
            System.out.println("Hello World");
        } finally {
            System.out.println("Finally executing");
        }
    }
}
