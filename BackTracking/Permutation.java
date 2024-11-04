package BackTracking;

import java.util.HashSet;


public class Permutation {
    public static void main(String[] args) {

        //string
        String st = "aab";

        HashSet<String> hs = new HashSet<>();

        permutate(st.toCharArray(), 0 , hs);
        System.out.println(hs);

    }

    private static void permutate(char[] ch, int start, HashSet<String> hs) {
        if(start >= ch.length ) {
            hs.add(new String(ch));
            return;
        }
        for(int i = start; i < ch.length; i++) {
            swap(ch, start, i);
            permutate(ch, start + 1, hs);
            swap(ch, start, i);
        }


    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
