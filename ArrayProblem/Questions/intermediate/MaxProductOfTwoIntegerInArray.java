package ArrayProblem.Questions.intermediate;
/*
 Find the maximum product of two integers in an array.
 Input:
[1, 20, -1, -30]
 Output:
600
 */
public class MaxProductOfTwoIntegerInArray {
    public static void main(String[] args) {

        int ar[] = {1,20,-1,-30};

        sumprod(ar);
        System.out.println(sumprod(ar));

    }

    private static int sumprod(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                int prod = ar[i] * ar[j];
                if(prod < 0){
                    prod = prod * (-1);
                }
                if(prod > max) {
                    max = prod;
                }
            }
        }
        return max;
    }
}
