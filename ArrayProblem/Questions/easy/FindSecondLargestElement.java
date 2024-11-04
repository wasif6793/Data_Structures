package ArrayProblem.Questions.easy;
/*
 Find the second largest element in an array.
 Input:
[12, 35, 1, 10, 34, 1]
 Output:
34
 */
public class FindSecondLargestElement {
    public static void main(String[] args) {

        int ar[] = {4,5,3,2,1};

        System.out.println(find(ar));
    }

    private static int find(int[] ar) {

        int lgt = ar[0];
        int sl  = ar[1];

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] > lgt) {
                sl = lgt;
                lgt = ar[i];
            }
            if (ar[i] > sl && ar[i] < lgt) {
                sl = ar[i];
            }
        }
        return sl;

    }
}
