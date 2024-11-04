package ArrayProblem.Questions.easy;
/*
Right rotate an array by one position.
 Input: [1, 2, 3, 4, 5]
 Output: [5, 1, 2, 3, 4]
 */
public class RightRotateArrayByOnePosition {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6};

        for(int num : rotate(ar)){
            System.out.print(num + " ");
        }

    }

    public static int[] rotate(int[] ar){

        int temp = ar[ar.length - 1];
        for (int i = ar.length - 1; i > 0; i--) {
            ar[i] = ar[i - 1];
        }
        ar[0] = temp;
        return ar;
    }
}
