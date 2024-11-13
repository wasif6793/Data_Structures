package recursion;

public class Fib_With_Memo {
    public static void main(String[] args) {
        int n = 7;
        fib(n);
        System.out.println(fib(n));
        System.out.println(counter);
    }
    static Integer[] memo = new Integer[100];
    static int counter = 0;

    public static int fib(int n) {

        counter++;
        if(memo[n] != null) {
            return memo[n];
        }
        if(n == 0 || n ==1){
            return n;
        }

        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];

    }

    // Using Bottom up approach
    public static int fibBottomup(int n){
        int[] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;

        for(int i = 2; i <= n; i++){
            fibList[i] = fibList[i-1] + fibList[i-2];
        }
        return fibList[n];
    }
}
