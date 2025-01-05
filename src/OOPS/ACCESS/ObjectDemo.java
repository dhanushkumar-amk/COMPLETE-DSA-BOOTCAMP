package OOPS.ACCESS;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(10);
        ObjectDemo obj2 = new ObjectDemo(10);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
