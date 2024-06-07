package problem.solving.recursive;

public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // n * ( n -1) * (n-2) * (n-3) * (n-4) .... 1

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
