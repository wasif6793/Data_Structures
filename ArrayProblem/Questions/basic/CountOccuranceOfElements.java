package ArrayProblem.Questions.basic;



public class CountOccuranceOfElements {
    public static void main(String[] args) {
        int target = 4;

        int ar[] = {1,2,3,4,4,5,4,6,4,2,4,6};

        System.out.println(count(ar, target));
    }

    private static int count(int[] ar, int target) {

        int count = 0;

        for(int i = 0; i < ar.length; i++) {
            if(ar[i] == target){
                count++;
            }
        }
        return count;
    }


}
