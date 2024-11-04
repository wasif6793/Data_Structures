package ArrayProblem.Questions.easy;

/*
 Reverse the elements of an array.
 Input:
[1, 2, 3, 4, 5]
 Output:
[5, 4, 3, 2, 1]
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};
        revOne(ar);
        System.out.println();
        revTwo(ar);
    }

    private static void revTwo(int[] ar) {

        for (int i = 0; i < ar.length/2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length-1-i];
            ar[ar.length-1-i] = temp;

        }

        for(int num : ar){
            System.out.print(num + " ");
        }

    }

    private static void revOne(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
