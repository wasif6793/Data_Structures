package ArrayProblem.Questions.easy;
/*
Check if an array is sorted.
 Input: [1, 2, 3, 4, 5]
 Output: True
 */
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {

        int ar[] = {2,1};


        System.out.println(checksort(ar));
    }

    private static boolean checksort(int[] ar) {
        if (ar.length == 0) return false;

        for (int i = 0; i < ar.length - 1; i++) {
            if(ar[i] > ar[i+1]) {
                return false;
            }
        }
        return true;
    }
}
