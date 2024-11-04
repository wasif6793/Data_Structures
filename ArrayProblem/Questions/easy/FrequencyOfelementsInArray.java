package ArrayProblem.Questions.easy;

import java.util.HashMap;

/*
Find the frequency of each element in an array.
 Input: [1, 2, 2, 3, 3, 3]
 Output: {1: 1, 2: 2, 3: 3}
 */
public class FrequencyOfelementsInArray {
    public static void main(String[] args) {
        int ar[] = {1,2,2,3,4,5,5,6,6,7,8};

        frequency(ar);
    }

    private static void frequency(int[] ar) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i = 0; i < ar.length; i++){
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }
        System.out.println(map);
    }
}
