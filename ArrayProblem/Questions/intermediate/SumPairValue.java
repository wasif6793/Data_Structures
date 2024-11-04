package ArrayProblem.Questions.intermediate;

import java.util.ArrayList;

/*
 Find all pairs in an array that sum to a given value x.

Input:
[1, 5, 7, -1] ,x=6
 Output:
[(1, 5), (7, -1)]
*/
public class SumPairValue {
    public static void main(String[] args) {

        int ar[] = {1,5,7,-1};
        int x = 6;

        sumpair(ar, x);

    }

    private static void sumpair(int[] ar, int x) {

        ArrayList<int[]> ls = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == x) {
                    ls.add(new int[]{ar[i], ar[j]});
                }
            }
        }

//        for (int i = 0; i < ar.length -1; i++) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int j = i + 1; j < ar.length; j++) {
//                if (ar[i] + ar[j] == x) {
//                    list.add(ar[i]);
//                    list.add(ar[j]);
//                }
//                ls.add(list);
//                break;
//            }
//
//        }
        for(int[] pair : ls){
            System.out.println(pair[0] + " " + pair[1]);
        }

        System.out.println(ls);



    }
}
