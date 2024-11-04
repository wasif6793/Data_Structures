package BackTracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationsOfString {

    public static void main(String[] args) {
        String str = "aab";
        HashSet<String> permutations = new HashSet<>();
        permute(str.toCharArray(), 0, permutations);
        System.out.println(permutations);
    }

    private static void permute(char[] arr, int start, HashSet<String> result) {
        if (start >= arr.length) {
            result.add(new String(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i); // Current index ko start ke saath swap karo
            permute(arr, start + 1, result); // Recursion ke liye call karo
            swap(arr, start, i); // Backtrack karke original string ko wapas laao
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

