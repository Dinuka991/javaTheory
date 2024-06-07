package problem.solving.recursive;

public class Fibonaci {

    //F(n)=F(n−1)+F(n−2)

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n -1) + fibonacci(n - 2);
        }
    }

}
