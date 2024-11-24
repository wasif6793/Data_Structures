package ArrayProblem.Questions.basic;

public class FirstOccurance {
    public static void main(String[] args) {

        String haystack = "mississippi", needle = "issip";

        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if( needle.length() == 0 || haystack.length() == 0 || haystack.length() < needle.length() ) return -1;

        int s = 0;
        int i = 0;
        int x = 0;
        while( i < haystack.length() && s < needle.length()) {
            while( i < haystack.length()){
                if(needle.charAt(s) ==  haystack.charAt(i)){
                    if(s == needle.length() - 1) return i - s;
                    s++;

                } else {
                    s = 0;
                }
                i++;
            }
            x++;
            i = x;

        }



        return - 1;
    }
}
