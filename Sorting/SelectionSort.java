package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int nums[] = {2,5,4,6,1,3};

        selectionSort(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
