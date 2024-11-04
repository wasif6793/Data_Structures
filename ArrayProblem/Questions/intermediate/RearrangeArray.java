package ArrayProblem.Questions.intermediate;
/*
Rearrange an array so that   arr[i] becomes  arr[arr[i]]
Input:
[4, 0, 2, 1, 3]
 Output:
[3, 4, 2, 0, 1]

 */
public class RearrangeArray {
    public static void main(String[] args) {

        int ar[] = {4, 0, 2, 1, 3 };

        rearranging(ar);
        for(int n : rearranging(ar)){
            System.out.print(n + " ");
        }


    }

    private static int[] rearranging(int[] ar) {

        int ar1[] = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            ar1[i] =ar[ar[i]];

        }

        return ar1;
    }
}
