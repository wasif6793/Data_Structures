package ArrayProblem.Questions.intermediate;

import java.util.ArrayList;

/*
Find the subarray with a given sum.
 Input:
[1, 4, 20, 3, 10, 5] , sum = 33
Output:
[20, 3, 10]
 */
public class SubArrayWithGIvenSUm {
    public static void main(String[] args) {
        int ar[] = { 1, 4, 20, 3, 10, 5};
        int sum = 33;

        solution(ar, sum);
    }

    private static void solution(int[] ar, int sum) {
        int val = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            val = val + ar[i];
        }

        if(val > sum){

        }
    }
}
