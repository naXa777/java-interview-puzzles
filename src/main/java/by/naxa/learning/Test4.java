package by.naxa.learning;

/**
 * Q: What line(s) can be uncommented safely? (i.e. without compile-time or runtime errors)
 * A: {@code System.out.print(sOne);} and {@code System.out.print(iArgs);}
 *
 * Q: Given the following code, who has access to member {@code sOne}?
 * A: Class {@code Test4} and classes within the same package ({@code by.naxa.learning}).
 */
public class Test4 {
    String sOne = new String("OOPS !!! JAVA");

    public void method1(final int iArgs) {
        int iOne;
        class Bicycle {
            public void sayHello() {
                //System.out.print(sOne);
                //System.out.print(iOne);
                //System.out.print(iTwo);
                //System.out.print(iArgs);
            }
        }
    }

    public void method2() {
        int iTwo;
    }
}
