package OOPS.POLYMORPHISM;

public class PrintOver {

   int num;

    public PrintOver(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "PrintOver{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        PrintOver print = new PrintOver(5);
        System.out.println(print);



    }
}
