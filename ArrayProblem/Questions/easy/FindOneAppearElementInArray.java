package ArrayProblem.Questions.easy;
/*
\ Find the element that appears only once in an array where all others appear
twice.
 Input:
[2, 3, 5, 4, 5, 3, 4]
 Output: 2
 */
public class FindOneAppearElementInArray {
    public static void main(String[] args) {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};

        findOne(ar);
        System.out.println(findOne(ar));
    }

    private static int findOne(int[] ar) {
        int element = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j] ) {
                    break;
                } else if(ar[i] != ar[j] && j == ar.length-1) {
                    element = ar[i];
                    return element;
                }
            }
        }

        return -1;
    }
}
