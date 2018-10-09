package by.naxa.learning;


/**
 * Q: What would happen on trying to compile and run the following code?
 * • A runtime error will occur because class House is not defined as final.
 * • Successful compilation and output of "maintainMethod" at run time.
 * • A compilation error indicating that a class with any final methods must be declared final itself.
 * • A compilation error indicating that you cannot inherit from a class with final methods.
 *
 * A: Successful compilation and output of "maintainMethod" at run time.
 */
class House {

    public final void maintainMethod() {
        System.out.println("maintainMethod");
    }
}

public class Building extends House {

    public static void main(String... args) {
        House h = new House();
        h.maintainMethod();
    }
}
