package ArrayProblem.Questions.easy;
/*
Count the number of even and odd elements in an array.
 Input:
[1, 2, 3, 4, 5]
 Output:
Even: 2, Odd: 3
 */
public class CountEvenOrOddinArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6,7,8};

        searching(ar);
    }

    private static void searching(int[] ar) {

        int even = 0;
        int odd = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                even++;
            }
            if (ar[i] % 2 == 1) {
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
