package searching;

public class BinarySearch {
    public static void main(String[] args) {
        
        int nums[] = {1,3,5,6,7,8,9};

        int tgt = 3;

        int result = binarySearch(nums, tgt);

        System.out.println("Element found in Index:" + result );

        
    }

    public static int binarySearch(int nums[], int tgt){
        int start = 0;
        int end = nums.length - 1;

        while(start< end){
            int mid = start + (end - start) / 2;

            if(tgt > nums[mid]){
                start = mid + 1;
            } else if( tgt < nums[mid]){
                end = mid - 1;
            } else {
                return mid;
            }

        }


        return -1;

    }

}
