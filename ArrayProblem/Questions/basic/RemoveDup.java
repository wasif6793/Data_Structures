package ArrayProblem.Questions.basic;

import java.util.ArrayList;

public class RemoveDup {
    public static void main(String[] args) {

        int ar[] = {1,2,2,3,4,4,5,6,9};

        rem(ar);
    }

    private static void rem(int[] ar) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar.length - 1; i++) {
            if(ar[i] < ar[i+1]){
                list.add(ar[i]);
            }
        }
        System.out.println(list);
    }
}
