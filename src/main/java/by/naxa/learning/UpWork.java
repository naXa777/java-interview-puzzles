package by.naxa.learning;

/**
 * Q: What does the following code output?
 * A: 0
 */
public class UpWork {
    int jobs;

    public void UpWork() {
        jobs = 10;
    }

    public static void main(String[] args) {
        UpWork upw = new UpWork();
        System.out.println(upw.jobs);
    }
}