package OOPS.STATICKEYWORD;

public class Tostring {
    public static void main(String[] args) {
        fun a = new fun("dhanush");
        System.out.println(a);
    }
}

class fun{

    String name;

    public fun(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    // without declere the name it generate same random name
//    OOPS.Static.fun@6acbcfc0
}

