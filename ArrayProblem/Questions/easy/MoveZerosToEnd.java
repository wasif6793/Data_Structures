package ArrayProblem.Questions.easy;
/*
Move all zeros to the end of an array.
 Input: [0, 1, 0, 3, 12]
 Output: [1, 3, 12, 0, 0]
 */

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int ar[] = {1,0,2,3,0,0,2,0,6,7};

        moving(ar);
    }

    // Approach One
    private static void movingzerotoend() {
        int ar[] = {1,2,0,3,5,0,4};
        int n = ar.length -1;
        int m = 0;

        int ar2[] = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                ar2[n] = ar[i];
                n--;
            } else {
                ar2[m] = ar[i];
                m++;
            }
        }

        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i]);
        }


    }

    //Approach Two
    private static void moving(int[] ar) {
        int index  = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] != 0) {
                ar[index] = ar[i];
                index++;
            }
        }

        while (index < ar.length) {
            ar[index] = 0;
            index++;
        }

        for(int num : ar){
            System.out.print(num + " ");
        }
    }
}
