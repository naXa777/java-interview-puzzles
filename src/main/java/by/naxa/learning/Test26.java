package by.naxa.learning;

/**
 * Q: Does this code compile? If yes, how many times "true" is printed out?
 * A: Yes. Exactly three times.
 */
public class Test26 {

    public static void main(String... args) {
        String s1 = "Java 8";
        String s2 = "Java 8";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java").append(" 8");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}
