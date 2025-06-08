package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        LexicographicalNumbers ans = new LexicographicalNumbers();
        int n = 13;
        System.out.println(ans.lexicalOrder(n));
    }
    public List<Integer> lexicalOrder1(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        Arrays.sort(arr, (a, b) -> a.toString().compareTo(b.toString()));
        return Arrays.asList(arr);
    }


    public List<Integer> lexicalOrder(int n) {
        int current = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            list.add(current);
            if(current * 10 <= n)
                current = current * 10;
            while(current % 10 == 9 || current + 1 > n)
                current = current / 10;

            current++;
        }
        return list;
    }

}
