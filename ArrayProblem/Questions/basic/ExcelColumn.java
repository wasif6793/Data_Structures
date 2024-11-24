package ArrayProblem.Questions.basic;

import java.util.HashMap;

public class ExcelColumn {
    public static void main(String[] args) {

        int columnNumber = 701;

        System.out.println(convertToTitle(columnNumber));
    }

    private static String convertToTitle(int columnNumber) {

        HashMap<Integer, String> hm = new HashMap<>();

        String[] st = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        int v = 1;
        for(String s : st){
            hm.put(v,s);
            v++;
        }

        for( String s1 : st){
            for(String s2 : st){
                hm.put(v, s1 + s2);
                v++;
            }
        }

        return hm.get(columnNumber);
    }
}
