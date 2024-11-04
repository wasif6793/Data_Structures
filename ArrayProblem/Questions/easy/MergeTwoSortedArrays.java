package ArrayProblem.Questions.easy;
/*
Merge two sorted arrays.
 Input: [1, 3, 5] and [2, 4, 6]
 Output: [1, 2, 3, 4, 5, 6]

 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int ar1[] = {1,3,5};
        int ar2[] = {2,4,6};

        merging(ar1,ar2);

        for (int i = 0; i < merging(ar1,ar2).length; i++) {
            System.out.print(merging(ar1,ar2)[i]);

        }

    }

    private static int[] merging(int[] ar1, int[] ar2) {
        int ar3[] = new int[ar1.length + ar2.length];
        int i1 = 0,  i2 = 0, i3 = 0;
        while (i1 < ar1.length && i2 < ar2.length) {
            if (ar1[i1] < ar2[i2]) {
                ar3[i3] = ar1[i1];
                i1++;
                i3++;

            }
            else {
                ar3[i3] = ar2[i2];
                i2++;
                i3++;
            }
        }

        while(i1 < ar1.length) {
            ar3[i3] = ar1[i1];
            i1++;
        }
        while(i2 < ar2.length) {
            ar3[i3] = ar2[i2];
            i2++;
        }


        return ar3;
    }
}
