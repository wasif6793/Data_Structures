package ArrayProblem.Questions.easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Find the union of two arrays.
 Input:
[1, 2, 2, 1] , [2, 3]
Output:
[1, 2, 3]

 */
public class findUnionOfTwoArrays {
    public static void main(String[] args) {
        int ar1[] = {1,2,2,1};
        int ar2[] = {2,3};

        union(ar1, ar2);

        method2();
    }
    public static void union(int ar1[], int ar2[]){
        int ar3[] = new int[ar1.length +  ar2.length];
        int ind1 = ar1.length - 1;
        int ind2 = ar2.length - 1;

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < ar1.length; i++) {
                ar3[i] = ar1[ar1.length - 1 - ind1];
                ind1--;


        }

        for (int i = ar1.length; i < ar3.length; i++) {
                ar3[i] = ar2[ar2.length - 1 - ind2];
                ind2--;

        }

        Arrays.sort(ar3);
        ls.add(ar3[0]);

        int l = 0;
        int m = 1;

        while( m < ar3.length){
            if(ar3[l] < ar3[m]){
                ls.add(ar3[m]);

            }
            m++;
            l++;
        }
        System.out.println(ls);

    }

    // method 2

    private static void method2(){
        int arr[] = {1,2,3,5,6,7};
        int arr2[] = {2,3,4,9,12,14};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        for (int j = 0; j < arr2.length; j++) {
            if (!list.contains(arr2[j])) {
                list.add(arr2[j]);
            }
        }
        System.out.println(list);
    }

}
