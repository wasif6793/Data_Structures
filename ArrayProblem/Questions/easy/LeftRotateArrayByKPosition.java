package ArrayProblem.Questions.easy;
/*
Left rotate an array by k positions.
 Input: [1, 2, 3, 4, 5], k=2
 Output: [3, 4, 5, 1, 2]
 */
public class LeftRotateArrayByKPosition {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6};
        int k = 3;

        for(int num : rotate(ar, k)){
            System.out.print(num + " ");
        }
    }

    private static int[] rotate(int[] ar, int k) {

        int l = 1;

        for (int i = k - 1; i >= 0; i--) {


            for (int j = i; j < ar.length - l; j++) {
                int temp = ar[j];
                ar[j] = ar[j +1];
                ar[j + 1] = temp;
            }
            l++;
        }

        return ar;
    }
}
