package ArrayProblem.Questions.intermediate;
/*
 Implement a function to perform a binary search on a sorted array.
 Input:  [1, 2, 3, 4, 5] ,  key=3
Output: 2 (index)


 */
public class BinarySearchQues {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        int key = 3;

        searching(ar, key);

        System.out.println(searching(ar, key));
    }

    private static int searching(int[] ar, int key) {

        int start = 0, end = ar.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(ar[mid] == key){
                return mid;
            } else if(ar[mid] > key){
                end  = mid - 1;

            } else{
                start = mid + 1;
            }
        }

        return - 1;
    }
}
