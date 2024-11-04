package ArrayProblem.Questions.easy;

import java.util.ArrayList;

/*
Find the intersection of two arrays.
 Input:
[1, 2, 2, 1] ,
[2, 2]
 Output:
[2, 2]
 */
public class FindIntersectionOfTwoArrays {
    public static void main(String[] args) {

      int ar1[] = {1,2,2,1};
      int ar2[] = {2,2};

      intersection(ar1, ar2);
    }

    private static void intersection(int[] ar1, int[] ar2) {
        ArrayList<Integer> list = new ArrayList<>();

        if(ar1.length < ar2.length){
            for (int i = 0; i < ar1.length; i++) {
                for(int j = 0; j < ar2.length; j++){
                    if(ar1[i] == ar2[j]){
                        list.add(ar1[i]);
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < ar1.length; i++) {
                for(int j = 0; j < ar2.length; j++){
                    if(ar1[i] == ar2[j]){
                        list.add(ar2[j]);
                        break;
                    }
                }
            }
        }

        System.out.println(list);


    }
}
