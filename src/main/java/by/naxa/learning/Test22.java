package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: _START_STATIC_MAIN_BIN_BASE_INIT_CONST
 */
public class Test22 extends _Test22 {
    {
        System.out.print("_INIT");
    }

    static {
        System.out.print("_STATIC");
    }

    Test22() {
        System.out.print("_CONST");
    }

    public static void main(String[] args) {
        System.out.print("_MAIN");
        new Test22();
    }
}

class _Test22 {
    {
        System.out.print("_BIN");
    }

    static {
        System.out.print("_START");
    }

    _Test22() {
        System.out.print("_BASE");
    }
}