package ArrayProblem.Questions.easy;

public class BinarySearchInArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,8,9,11,13,45,67,87};
        int target = 3;

        System.out.println(searching(ar, target));
    }

    private static int searching(int[] ar, int tg) {

        int start = 0, end = ar.length - 1;

        while ( start < end){
            int mid = start + (end - start) / 2;
            if(ar[mid] == tg){
                return mid;
            } else if ( ar[mid] > tg){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
