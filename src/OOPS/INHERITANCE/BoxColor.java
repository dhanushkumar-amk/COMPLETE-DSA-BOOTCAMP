package OOPS.INHERITANCE;

public class BoxColor extends BoxPrice{

    String color;

    public BoxColor(String color) {
        this.color = color;
    }


    // perfect example for

    public BoxColor(double h, double l, double w, double weight, double cost, String color) {
        super(h, l, w, weight, cost);
        this.color = color;
    }
}
