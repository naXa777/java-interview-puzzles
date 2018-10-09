package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: Any of the following: XYZ, XZY, YXZ, YZX, ZXY, ZYX
 */
public class Test3 {
    public static void main(String[] args) {
        T x = new T("X", null);
        x.start();
        T y = new T("Y", x);
        y.start();
        T z = new T("Z", y);
        z.start();
    }
}

class T extends Thread {
    private final Thread predecessor;
    private final String name;

    T(String name, Thread predecessor) {
        this.predecessor = predecessor;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 89));
            System.out.print(name);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
