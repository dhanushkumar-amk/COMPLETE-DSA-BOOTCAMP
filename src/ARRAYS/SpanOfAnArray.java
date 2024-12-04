package ARRAYS;

public class SpanOfAnArray {
    public static void main(String[] args) {
        int[] arr ={12,23,43,12,65,34};
        System.out.println(span(arr));
    }
    static  int span(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

          int span = max - min;

        return span;

    }
}
