package OOPS.SINGLETONCLASS;

public class main {
    public static void main(String[] args) {
        SingletonClass obj1 =  SingletonClass.getInstance();
        SingletonClass ob2 = SingletonClass.getInstance();

        System.out.println(obj1.na);
    }
}
