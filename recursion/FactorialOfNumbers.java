package recursion;
// Finding Factorial of a number using recursion
public class FactorialOfNumbers {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {

        if(n == 1) return 1;

        return n * factorial(n - 1);
    }
}
