package Sorting;

import java.util.Arrays;

public class MergerSort {

    public static void main(String[] args) {

        int nums[] = {2,1,3,4,6,5,7,9,8};

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSort(nums);

        for(int num : mergeSort(nums) ){
            System.out.print(num + " ");
        }

    }

    private static int[] mergeSort(int[] nums) {

        if(nums.length == 1) return nums;
        int midIndex = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(nums,midIndex,nums.length));
        return merge(left,right);
    }

    // Helper method
    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, index = 0;
        while( i < a.length && j < b.length){
            if(a[i] < b[j]){
                merged[index] = a[i];
                index++;
                i++;
            } else {
                merged[index] = b[j];
                index++;
                j++;
            }
        }
        while (i < a.length) {
            merged[index] = a[i];
            index++;
            i++;
        }
        while(j < b.length){
            merged[index] = b[j];
            index++;
            j++;
        }
        return merged;
    }
}
