package by.naxa.learning;

/**
 * Q: What line(s) can be uncommented safely? (i.e. without compile-time or runtime errors)
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
