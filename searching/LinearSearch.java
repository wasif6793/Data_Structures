package searching;

public class LinearSearch {

    public static void main(String[] args) {
        
        int nums[] = { 1,2,4,5,6,7,8,9};

        int tgt = 4;

        int result = linearSearch(nums, tgt);

        System.out.println("Element index is found: " + result);
    }

    public static int linearSearch(int nums[], int tgt){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == tgt){
                return i ;
            }
        }

        return -1;

    }

}
