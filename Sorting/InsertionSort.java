package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {2,5,4,6,1,3};

        insertionSort(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }

    private static void insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}
