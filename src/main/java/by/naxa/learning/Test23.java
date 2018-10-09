package by.naxa.learning;

/**
 * Q: What is the output of the given program?
 * A: 112
 */
public class Test23 {
    public static void main(String[] args) {
        A a = new A2();
        B b = new B2();
        C c = new C2();
        System.out.println(a.a + "" + b.b + "" + c.c());
    }
}

class A {
    int a = 1;
}

class A2 extends A {
    int a = 2;
}

class B {
    public int b = 1;
}

class B2 extends B {
    public int b = 2;
}

class C {
    public int c() {
        return 1;
    }
}

class C2 extends C {
    public int c() {
        return 2;
    }
}
