package course_1.exercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        String primeNumbers = "";
        int n = 10;

        for (int i = 1; i <= n; i++) {
            int counter = 0;

            for (n = i; n == 1; n--) {
                if (i % n == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println(primeNumbers);
    }
}
