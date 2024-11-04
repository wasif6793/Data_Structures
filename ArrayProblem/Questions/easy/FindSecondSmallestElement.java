package ArrayProblem.Questions.easy;
/*
 Find the second smallest element in an array.
 1
 Array 50 Practice Questions
Array 50 Practice Questions 2
 Input: [12, 13, 11, 15, 14]
 Output: 12
 */
public class FindSecondSmallestElement {
    public static void main(String[] args) {
        int ar[] = {1,2,3,45,6,7,8};

        check(ar);
        System.out.println(check(ar));
    }

    private static int check(int[] ar) {

        int m = ar[0];
        int sm = ar[1];

        for (int i = 0; i < ar.length; i++) {

            if(ar[i] < m){
                sm = m;
                m = ar[i];
            }
            if(ar[i] < sm && ar[i] < m){
                sm = ar[i];

            }
        }

        return sm;
    }
}
