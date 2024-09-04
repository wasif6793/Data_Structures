package pointers;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        hm1.put("one", 1);
        hm2.put("two", 2);
        hm = hm1;
        hm1 = hm2;
        // now hm is pointing to vale of {one=1}

        System.out.println(hm);
        System.out.println(hm1);
    }
}
