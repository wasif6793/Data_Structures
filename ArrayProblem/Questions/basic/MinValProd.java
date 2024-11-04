package ArrayProblem.Questions.basic;
/*
Given an array, update all elements of the given array to some minimum value x,
such that the product of all elements of this new array is strictly greater than the product
of all elements of the initial array.

Examples:

Input: arr[] = [4, 2, 1, 10, 6]
Output: 4
Explanation: 4 is the smallest value such that 4 * 4 * 4 * 4 * 4 > 4 * 2 * 1 * 10 * 6.
 */
public class MinValProd {
    public static void main(String[] args) {

        System.out.println(findMinValue(new int[]{4, 2, 1, 10, 6}));

    }
    public static int findMinValue(int[] arr) {
        long mul = 1;
        long large = arr[0];
        for(int i = 0; i <arr.length; i++){
            mul *= arr[i];
            if(arr[i] > large){
                large = arr[i];
            }
        }

        for(long i = 1; i <= large; i++){
            if(Math.pow(i,arr.length) > mul){
                return (int) i;
            }
        }
        return -1;
    }



}
