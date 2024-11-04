package ArrayProblem.Questions.easy;
/*
 Find the largest sum contiguous subarray Kadaneʼs Algorithm).
 Input: [-2, -3, 4, -1, -2, 1, 5, -3]
 Output: 7
 */
public class KadanesAlgorithm {
    public static void main(String[] args) {

        int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};


        System.out.println(algo(ar));
    }

    private static int algo(int[] ar) {

        int maxCurrent = ar[0];
        int maxGlobal = ar[0];

        for (int i = 1; i < ar.length; i++) {
            maxCurrent = Math.max(maxCurrent + ar[i], ar[i]);

            if(maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}
