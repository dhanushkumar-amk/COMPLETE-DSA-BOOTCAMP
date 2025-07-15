package STRIVER_SHEET.RECURSION;

public class PrintNamesInFiveTimes {
    public static void main(String[] args) {
        func();
    }

    static int count = 0;
 public  static void func(){
        if(count == 5)
            return;

        System.out.println("dhanushkumar");
        count++;
        func();
    }

}
