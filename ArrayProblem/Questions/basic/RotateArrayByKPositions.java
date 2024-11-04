package ArrayProblem.Questions.basic;

public class RotateArrayByKPositions {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6,7,8,9};
        int k = 5;

        rotate(ar, k);
    }

    private static void rotate(int[] ar, int k) {
        for (int i = 0; i < k / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[ k  - i];
            ar[ k  - i] = temp;

        }
        for(int num : ar){
            System.out.print(num + " ");
        }
    }
}
