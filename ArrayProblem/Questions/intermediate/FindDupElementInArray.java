package ArrayProblem.Questions.intermediate;

import java.util.ArrayList;
import java.util.List;

/*
Find the duplicate number in an array of
n+1 integers where each integer is
between 1 and n.
 Input:
[1, 3, 4, 2, 2]
 Output: 2
 */
public class FindDupElementInArray {
    public static void main(String[] args) {

        int ar[] = {1, 3, 4, 2, 2};

        System.out.println(finddup(ar));
    }


    private static int finddup(int[] ar) {
        int dup = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    dup = ar[i];
                    return dup;
                }
            }
        }

        return -1;
    }
}
