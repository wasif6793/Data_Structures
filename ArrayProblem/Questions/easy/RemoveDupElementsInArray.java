package ArrayProblem.Questions.easy;

import java.util.ArrayList;

/*
Remove duplicates from an array.
 Input:
[1, 2, 2, 3, 4, 4, 5]
 Output:
[1, 2, 3, 4, 5]
 */
public class RemoveDupElementsInArray {
    public static void main(String[] args) {

        int ar[] = {1,2,2,3,4,4,5,6,6,6,6,6,7,7,8};

        remdup(ar);
    }

    private static void remdup(int[] ar) {

        int l = 0;
        int m = 1;

        ArrayList<Integer> list = new ArrayList<>();

        while( m < ar.length) {
            if(ar[l] < ar[m]) {
                list.add(ar[m]);

            }
            l++;
            m++;
        }

        System.out.println(list);
    }
}
