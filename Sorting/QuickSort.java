package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int nums[] = {2,1,4,3,5,7,6};

        quickSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums){
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int left, int right) {

        if (left < right) {
            int pivotIndex = pivot(nums, left, right);
            quickSort(nums, left, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, right);
        }
    }
    private static int pivot(int[] nums, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if(nums[i] < nums[pivotIndex]){
                swapIndex++;
                swap(nums, swapIndex, i);
            }
        }
        swap(nums, pivotIndex, swapIndex);

        return swapIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
