package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = {2,5,4,6,1,3};
        bubbleSort(nums);
        for(int num : nums){
            System.out.print(num+ " ");
        }
    }

    private static void bubbleSort(int[] nums) {

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
