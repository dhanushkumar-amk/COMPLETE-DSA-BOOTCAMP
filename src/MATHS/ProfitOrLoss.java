package MATHS;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int costPrice = sc.nextInt();

        System.out.println("Enter the selling price : ");
        int sellingPrice = sc.nextInt();

        profitOrLoss(costPrice,sellingPrice);
    }

    static void profitOrLoss(int costPrice, int sellingPrice){

        int answer = sellingPrice - costPrice;
        int result = Math.abs(answer);

        if (answer == 0)
            System.out.println("Nothing profit or loss " + result);

        if (answer > 0)
            System.out.println("Profit " + result);
        else if(answer < 0)
            System.out.println("Loss " + result);    }
}
