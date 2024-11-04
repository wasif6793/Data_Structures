package ArrayProblem.Questions.intermediate;
/*
 Find the kth smallest element in an array.
 Input:
[7, 10, 4, 3, 20, 15] , k=3
Output: 7

 */
public class KthSmallestElement {
    public static void main(String[] args) {

        int ar[] = {7, 10, 4, 3, 20, 15};
        int k = 3;


        System.out.println(solution(ar, k));

    }

    private static int solution(int[] ar, int k) {
    int sm = ar[0];
    int index = 0;

    while (k > 0){
        sm =ar[index];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < sm) {
                sm = ar[i];
                index = i;
            }
        }
        ar[index] = 1000;
        k--;
    }


    return sm;
    }
}
