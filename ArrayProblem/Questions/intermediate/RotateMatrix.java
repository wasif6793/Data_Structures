package ArrayProblem.Questions.intermediate;
/*
 Rotate a square matrix 90 degrees clockwise.
 Input:
 Copy code
 1 2 3
 4 5 6
 7 8 9
 Output:
 Copy code
 7 4 1
 8 5 2
 9 6 3
 */
public class RotateMatrix {
    public static void main(String[] args) {
        int ar[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}
        };

        rotating(ar);
    }

    private static void rotating(int[][] ar) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                int temp = ar[ar.length -1 - i][ar[i].length - 1- j];
                ar[ar.length -1 - i][ar[i].length - 1- j] = ar[i][j];
                ar[j][i] = temp;
            }
        }

        for (int i = 0; i < ar.length; i++) { // Iterate through rows
            for (int j = 0; j < ar[i].length; j++) { // Iterate through columns
                System.out.print(ar[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }

    }
}
