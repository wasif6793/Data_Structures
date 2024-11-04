package ArrayProblem.Questions.intermediate;
/*
 Find the missing number in an array of size
n+1 .
 Input:
[1, 2, 4, 6, 3, 7, 8]
 Output: 5
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,6,7,8,9};

        find(ar);
        System.out.println(find(ar));
    }

    private static int find(int[] ar) {

        for (int i = 0; i < ar.length - 1; i++) {
            if(ar[i] != (ar[i+1] - 1)){
                return ar[i + 1] - 1;
            }
        }
        return -1;
    }
}
