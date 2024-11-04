package ArrayProblem.Questions.intermediate;

import java.util.HashMap;

/*
 Sort an array based on frequency of elements.
 Input:
[4, 5, 6, 5, 4, 3]
 Output:
[4, 4, 5, 5, 6, 3]
 */
public class SortingBasedOnFreqOfELements {
    public static void main(String[] args) {

        int ar[] = {4, 5, 6, 5, 4, 3};

        solution(ar);

    }

    private static int[] solution(int[] ar) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            freq.put(ar[i], freq.getOrDefault(ar[i], 0) + 1);
        }

        for (int i = 0; i < ar.length; i++) {

        }

        return ar;
    }
}
