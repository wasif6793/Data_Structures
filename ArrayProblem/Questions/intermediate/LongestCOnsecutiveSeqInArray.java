package ArrayProblem.Questions.intermediate;

import java.util.Arrays;

/*
Find the longest consecutive sequence in an array.
 Input:
[100, 4, 200, 1, 3, 2]
 Output:
4 (sequence: 1, 2, 3, 4)
 */
public class LongestCOnsecutiveSeqInArray {
    public static void main(String[] args) {
        int ar[] = {100, 4, 200, 1, 3, 2,5,7,6};

        consec(ar);
        System.out.println(consec(ar));
    }

    private static int consec(int[] ar) {
        int count = 1;
        int finalcount = 0;
        Arrays.sort(ar);

        for (int i = 0; i < ar.length - 1; i++) {
            if(ar[i] == ar[i + 1] - 1){
                count++;
            }
            finalcount = Math.max(count, finalcount);
        }

        return finalcount;
    }
}
