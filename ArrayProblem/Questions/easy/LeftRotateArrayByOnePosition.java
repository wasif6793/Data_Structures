package ArrayProblem.Questions.easy;
/*
Left rotate an array by one position.
 Input: [1, 2, 3, 4, 5]
 Output: [2, 3, 4, 5, 1]
 */
public class LeftRotateArrayByOnePosition {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};


        for(int num : rotate(ar)){
            System.out.print(num + " ");
        }
    }

    private static int[] rotate(int[] ar) {

        int temp = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            ar[i] = ar[i + 1];
        }
        ar[ar.length - 1] = temp;

        return ar;
    }
}
