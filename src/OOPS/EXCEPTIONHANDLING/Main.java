package OOPS.EXCEPTIONHANDLING;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        try {
            divide(a, b);
            String name = "dhanushkumar";

            if (name.equals("dhanuhskumar"))
                throw new CustomException("dhanushkumar");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
        System.out.println(e.getMessage());
    }
        finally {
            System.out.println("this will always execute");
        }


    }

    static int divide(int a, int b) throws Exception{

        if (b == 0)
            throw new Exception("pls don't divide by 0");

        return a/b;
    }
}
