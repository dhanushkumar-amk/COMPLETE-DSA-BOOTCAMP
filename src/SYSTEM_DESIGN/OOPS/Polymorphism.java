package SYSTEM_DESIGN.OOPS;

// two types
// 1 => compile time polymorphism or static polymorphism => method overloading
// 2 => run time polymorphism => method overriding

public class Polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}

class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area is pi * r * r");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area is side * side");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 1/2 * h * b");
    }
}

class Numbers {
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.sum(20, 30));
        System.out.println(numbers.sum(20, 30, 40));
    }



}



