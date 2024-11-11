package hashtable;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {






    // WRITE SUBARAYSUM METHOD HERE /
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

    public static int[] subarraySum(int[] nums, int target){

        if(nums.length == 0) return new int[]{};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];


            if(comp > 0){
                hm.put(nums[i], i);
            } else if( comp < 0){
                hm.remove(nums[n]);
                n++;
            } else{
                return new int[]{n,i};
            }
        }

        return new int[]{};
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */

    }

}
