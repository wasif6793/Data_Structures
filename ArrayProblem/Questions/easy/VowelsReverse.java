package ArrayProblem.Questions.easy;

public class VowelsReverse {
    public static void main(String[] args) {

        String s = "IcecreAm";
        System.out.println(reverseVowels(s));

    }
    public static String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while(left < right){

            if((ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i' || ch[left] == 'o' || ch[left] == 'u') && (ch[right] == 'a' || ch[right] == 'e' || ch[right] == 'i' || ch[right] == 'o' || ch[right] == 'u') ) {
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left] = temp;
                left++;
                right--;
            }

            if((ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i' || ch[left] == 'o' || ch[left] == 'u') &&
                    (ch[right] != 'a' || ch[right] !='e' || ch[right] != 'i' || ch[right] != 'o' || ch[right] != 'u') ){
                right--;
            } else if((ch[left] != 'a' || ch[left] != 'e' || ch[left] != 'i' || ch[left] != 'o' || ch[left] != 'u') && (ch[right] == 'a' || ch[right] == 'e' || ch[right] == 'i' || ch[right] == 'o' || ch[right] == 'u') ) {
                left++;
            } else {
                left ++;
                right--;
            }

        }

        return new String(ch);
    }
}
