package MATHS;

import java.util.Scanner;

public class PercentageCalculation {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the salary amount : ");
        int salary = sc.nextInt();
        percentage(salary);
    }

    public static void percentage(int salary){

        double needs = 0.4; // 50%
        double wants = 0.3; // 30%
        double savings = 0.2; // 20%

        int need = (int) (salary * needs);
        int want = (int) (salary * wants);
        int saving = (int) (salary * savings);

        System.out.println("the total salary " + salary);
        System.out.println("the amount for needs " +  need);
        System.out.println("the amount for wants " +  want);
        System.out.println("the amount for savings " +  saving);
    }


}
