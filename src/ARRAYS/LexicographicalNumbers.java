package ARRAYS;

import java.util.Arrays;
import java.util.List;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        LexicographicalNumbers ans = new LexicographicalNumbers();
        int n = 13;
        System.out.println(ans.lexicalOrder(n));
    }
    public List<Integer> lexicalOrder(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        Arrays.sort(arr, (a, b) -> a.toString().compareTo(b.toString()));
        return Arrays.asList(arr);
    }
}
