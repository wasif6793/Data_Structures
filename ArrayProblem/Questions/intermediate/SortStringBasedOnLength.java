package ArrayProblem.Questions.intermediate;

import java.util.ArrayList;

/*
Sort an array of strings based on length.
 Input:
["apple", "banana", "kiwi", "cherry"]
 Output:
["kiwi", "apple", "cherry", "banana"]
 */
public class SortStringBasedOnLength {
    public static void main(String[] args) {
        String ar[] = {"apple", "banana", "kiwi", "cherry"};

        solution(ar);
        for(String s : solution(ar)){
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
    }

    private static String[] solution(String[] ar) {

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1- i; j++) {
                if (ar[j].length() > ar[j+1].length()) {
                    String temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        return ar;
    }
}
