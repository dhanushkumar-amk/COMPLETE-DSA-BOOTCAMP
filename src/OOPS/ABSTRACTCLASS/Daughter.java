package OOPS.ABSTRACTCLASS;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
        void career() {
            System.out.println("I am going to be a dev");
        }

        @Override
        void partner() {
            System.out.println("i love somex and he age is 100");
        }

        @Override
        void normal() {
            super.normal();
         }

}

