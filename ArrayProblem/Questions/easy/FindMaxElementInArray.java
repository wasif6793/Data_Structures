package ArrayProblem.Questions.easy;
/*
 Find the maximum element in an array.
 Input:
[1, 2, 3, 4, 5]
 Output: 5
 */
public class FindMaxElementInArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6,7,8};

        searching(ar);
    }

    private static int searching(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >  max){
                max = ar[i];
            }
        }
        return max;
    }
}
