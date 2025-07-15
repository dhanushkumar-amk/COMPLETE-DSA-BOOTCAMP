package STRIVER_SHEET.RECURSION;

import java.util.Scanner;

public class PrintNamesInFiveTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int count = sc.nextInt();
        func(1, count);
    }


 public  static void func(int i, int count){
        if(i > count)
            return;

        System.out.println("dhanushkumar");
        func(i + 1, count);
    }

}
