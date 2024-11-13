public class MergerSort {

    public static void main(String[] args) {

        int nums[] = {2,1,3,4,6,5,7,9,8};

        mergeSort(nums);

    }

    private static void mergeSort(int[] nums) {
            
    }

    // Helper method
    public int[] merge(int[] a, int[] b) {
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
