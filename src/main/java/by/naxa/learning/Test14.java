package by.naxa.learning;

/**
 * Q: What exception is thrown by this piece of code  if {@code arr[j] > arr[j + 1]} ?
 * A: {@link ArrayIndexOutOfBoundsException}
 */
public class Test14 {

    public static void main(String[] args) {
        int[] arr = {12, 23, 43, 34, 3, 6, 7, 1, 9, 6};
        {
            int temp;
            for (int i = 0; i < arr.length; ++i) {
                for (int j = 0; j < arr.length - i; ++j) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j + 1] = arr[j];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
