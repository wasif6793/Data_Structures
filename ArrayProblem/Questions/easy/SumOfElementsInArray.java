package ArrayProblem.Questions.easy;
/*
 Find the sum of all elements in an array.
 Input:
[1, 2, 3, 4, 5]
 Output:
15
 */
public class SumOfElementsInArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6};


        System.out.println(sum(ar));
    }

    private static int sum(int[] ar) {

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];

        }

        return sum;
    }
}
