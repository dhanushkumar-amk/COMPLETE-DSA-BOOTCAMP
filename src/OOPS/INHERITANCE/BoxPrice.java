package OOPS.INHERITANCE;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double h, double l, double w, double weight, double cost) {
        super(h, l, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
