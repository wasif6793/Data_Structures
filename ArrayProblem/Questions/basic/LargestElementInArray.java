package ArrayProblem.Questions.basic;

public class LargestElementInArray {
    public static void main(String[] args) {

        int ar[] = {9,8,5,6,10,2,4};


        System.out.println(largest(ar));
    }

    private static int largest(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
