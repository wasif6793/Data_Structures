package ArrayProblem.Questions.intermediate;

import java.util.Arrays;

/*
 Find the median of two sorted arrays of equal size.
 Input:
[1, 3, 8, 9, 15] ,
[7, 11, 19, 21, 18]
 Output:
11
 */
public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int ar1[] = {1, 3, 8, 9, 15};
        int ar2[] = {7, 11, 19, 21, 18};

        solution(ar1,ar2);
        System.out.println(solution(ar1,ar2));


     }

    private static int solution(int[] ar1, int[] ar2) {
        int ar3[] = new int[ar1.length + ar2.length];

        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            ar3[i + ar1.length] = ar2[i];
        }
        Arrays.sort(ar3);

        int val = ar3[ar3.length / 2];



        return val;
    }
}
