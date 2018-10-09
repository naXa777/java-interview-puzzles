package by.naxa.learning;

/**
 * Q: What is the output of the given console application?
 * A: 3 4 5 8 6 1
 */
public class Test19 {
    public static void main(String[] args) {
        final int x = 9;
        int[][] a = {{3, 4, 5}, {9, 7, 2}, {8, 6, 1}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; ++j) {
                if (a[i][j] == x) break;
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
