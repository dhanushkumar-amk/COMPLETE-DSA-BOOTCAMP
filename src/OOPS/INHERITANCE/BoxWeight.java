package OOPS.INHERITANCE;

public class BoxWeight extends Box {
    double weight;


    public BoxWeight() {
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }




    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    // use the property of parent class
    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w);
        // extents from parent class, it is call a parent class constructor
        this.weight = weight;
    }
}
