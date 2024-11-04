package ArrayProblem.Questions.intermediate;
/*
 Find the common elements in three sorted arrays.
 Input:
[1, 5, 10] , [2, 3, 5] ,  [5, 6, 7]
Output:
[5]

 */
public class FindCommonElementIn3SortedArrays {
    public static void main(String[] args) {

        int ar1[] = {1,5,10};
        int ar2[] = {2,3,5};
        int ar3[] = {5,6,7};

        finding(ar1, ar2,ar3);
        System.out.println(finding(ar1, ar2,ar3));
    }

    private static int finding(int[] ar1, int[] ar2, int[] ar3) {


        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                for (int k = 0; k < ar3.length; k++) {
                    if (ar1[i] == ar2[j] && ar1[i] == ar3[k]) {
                        return ar1[i];
                    }
                }
            }
        }


    return -1;

    }
}
