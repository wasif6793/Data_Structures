package ArrayProblem.Questions.easy;

import java.util.ArrayList;
/*
 Print the elements of an array in alternate positions.
 Input:
[1, 2, 3, 4, 5, 6]
 Output:
[1, 3, 5]
 */
public class PrintAlternateNumsInArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};

        alterval(ar);
    }

    private static void alterval(int[] ar) {

        int n = ar.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                list.add(ar[i]);
            }
        }

        System.out.println(list);
    }
}
