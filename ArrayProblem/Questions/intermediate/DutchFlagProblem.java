package ArrayProblem.Questions.intermediate;
/*
 Sort an array of
key=3
 0s , 1s, and
Flag problem).
 2s without using extra space Dutch National
Input:
[0, 1, 2, 1, 0, 2, 0, 1]
 Output:
[0, 0, 0, 1, 1, 1, 2, 2]
 */
public class DutchFlagProblem {
    public static void main(String[] args) {

        int ar[] = {0, 1, 2, 1, 0, 2, 0, 1};

        solution(ar);
        for(int n : solution(ar)){
            System.out.print(n + " ");
        }

    }

    private static int[] solution(int[] ar) {

        int l = 0;
        int m = 1;
        int r = ar.length - 1;

        while (m <= r) {
            if(ar[m] == 0){
                int temp = ar[l];
                ar[l] = ar[m];
                ar[m] = temp;
                l++;
                m++;
            } else if (ar[m] == 2){
                int temp = ar[r];
                ar[r] = ar[m];
                ar[m] = temp;
                r--;
            } else{
                m++;
            }

        }

        return ar;
    }
}
