package course_1.exercises;

public class Factorial {
    public static void main(String[] args) {
        int num = factorial(10);
        System.out.println(num);
    }

    public static int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
}
