package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: _STATIC_MAIN_BASE_INIT_CONST
 */
public class Test5 extends _Test5 {
    {
        System.out.print("_INIT");
    }

    static {
        System.out.print("_STATIC");
    }

    private Test5() {
        System.out.print("_CONST");
    }

    public static void main(String[] args) {
        System.out.print("_MAIN");
        new Test5();
    }
}

class _Test5 {
    _Test5() {
        System.out.print("_BASE");
    }
}
