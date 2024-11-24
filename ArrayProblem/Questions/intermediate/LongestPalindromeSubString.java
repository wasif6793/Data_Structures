package ArrayProblem.Questions.intermediate;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        
        String s = "babad";
        solution(s);
    }
    
    private static void solution(String s) {
        int start = 0, end = 0;
        
        for(int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
        }
    }

    private static void expandAroundCenter(String s, int i, int i1) {
    }
}
