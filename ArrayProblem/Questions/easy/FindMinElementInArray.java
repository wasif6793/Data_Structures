package ArrayProblem.Questions.easy;

/*
Find the minimum element in an array.
 Input:
[4, 2, 7, 1, 9]
 Output: 1
 */
public class FindMinElementInArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6,7,8};

        searching(ar);
    }

    private static int searching(int[] ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] <  min){
                min = ar[i];
            }
        }
        return min;
    }
}
