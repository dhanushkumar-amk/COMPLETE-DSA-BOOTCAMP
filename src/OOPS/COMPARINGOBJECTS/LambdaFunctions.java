package OOPS.COMPARINGOBJECTS;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            arr.add(i);
        }

        // lambda expression example
        arr.forEach((item)  -> System.out.println(item + 2));

        // the above function is equal to
        System.out.println("------------------");
        for (int i = 0; i < arr.size() ; i++) {
            System.out.println(arr.get(i) + 2);
        }

    }

    int sum(int a, int b){
        return a + b;
    }
}
