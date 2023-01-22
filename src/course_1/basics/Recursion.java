package course_1.basics;

public class Recursion {
    public static void main(String[] args) {
        countDownFrom(5);
        countUpTo(0, 10);
    }

    public static void countDownFrom(int n) {
        // Stopping case
        if (n == 0) return;

        // Recursive case
        System.out.println("Countdown: " + n);
        countDownFrom(--n);
    }

    public static void countUpTo(int n, int y) {
        // Stopping case
        if (n == y) return;

        // Recursive case
        System.out.println("Countdown: " + n);
        countUpTo(++n, y);
    }
}
