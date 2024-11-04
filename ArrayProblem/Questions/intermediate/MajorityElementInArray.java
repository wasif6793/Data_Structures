package ArrayProblem.Questions.intermediate;

import java.util.HashMap;

/*
 Implement an algorithm to find the majority element.
 Input:
[3, 3, 4, 2, 4, 4, 2, 4, 4]
 Output: 4
 */
public class MajorityElementInArray {
    public static void main(String[] args) {

        int ar[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        solution(ar);
    }

    private static int solution(int[] ar) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            map.put(ar[i], map.getOrDefault(ar[i+ 1], 0) + 1);
        }

        return -1;
    }
}
