package ArrayProblem.Questions.intermediate;
/*
Count pairs in an array with a given difference.
 Input:
[1, 5, 3, 4, 2] , diff=3
Output:
2 (pairs: (1,4), (2,5))
 */
public class CountPairs {
    public static void main(String[] args) {
        int ar[] = { 1, 5, 3, 4, 2};

        int dif = 3;

        soultion(ar,dif);
        System.out.println(soultion(ar,dif));
    }

    private static int soultion(int[] ar, int dif) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int val = ar[i] - ar[j];
                if( val < 0){
                    val = val * (-1);
                }
                if (val == dif) {
                    count++;
                }
            }
        }

        return count;
    }
}
