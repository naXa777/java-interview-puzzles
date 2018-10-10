package by.naxa.learning;

/**
 * Q: What will be the output of the following code?
 * A: 4
 */
public class Test28 {

    static abstract class Base {
        protected Base() {
            init();
        }

        abstract void init();
    }

    static class Child extends Base {
        private static int value = 1;

        public Child() {
            value += 1;
        }

        @Override
        final void init() {
            value += 1;
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.init();
        System.out.println(Child.value);
    }
}
