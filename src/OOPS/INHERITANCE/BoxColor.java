package OOPS.INHERITANCE;

public class BoxColor extends BoxWeight{

    String color;

    public BoxColor(String color) {
        this.color = color;
    }


    // perfect example for


    public BoxColor(double h, double l, double w, double weight, String color) {
        super(h, l, w, weight);
        this.color = color;
    }
}
