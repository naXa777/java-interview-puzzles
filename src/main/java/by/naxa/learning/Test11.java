package by.naxa.learning;

/**
 * Q: Which statement is true about the given code?
 * • The code does not compile, because two setters have a formal parameter with the same name.
 * • The setters of the JBean class are JavaBean-compliant.
 * • The code compiles, but throws a {@link NullPointerException} at run-time.
 * • The code compiles and runs.
 *
 * A: The code compiles and runs.
 */
public class Test11 {
    public static void main(String[] args) throws Exception {
        new JBean().setHeight(1).setWidth(2).setDepth(3).setDensity(9);
    }
}

class JBean {
    private int height, width, depth, density;

    JBean setHeight(int h) {
        this.height = h;
        return this;
    }

    JBean setWidth(int w) {
        this.width = w;
        return this;
    }

    JBean setDepth(int d) {
        this.depth = d;
        return this;
    }

    JBean setDensity(int d) {
        this.density = d;
        return this;
    }
}