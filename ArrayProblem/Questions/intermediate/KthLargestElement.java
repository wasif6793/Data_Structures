package ArrayProblem.Questions.intermediate;
/*
 Find the kth largest element in an array.
 Input:
[3, 2, 1, 5, 6, 4] ,
k=2
 Output: 5
 */
public class KthLargestElement {
    public static void main(String[] args) {
        int ar[] = { 3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(solution(ar,k));
    }

    private static int solution(int[] ar, int k) {
        int lgst = ar[0];
        int index = 0;

        while( k > 0){
            lgst = ar[index];
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] > lgst) {
                    lgst = ar[i];
                    index = i;
                }
            }
            ar[index] = 0;
            k--;
        }

        return lgst;
    }
}
