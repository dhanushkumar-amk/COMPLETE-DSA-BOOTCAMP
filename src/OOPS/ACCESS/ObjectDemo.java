package OOPS.ACCESS;

public class ObjectDemo {

    int num;
   float gpa;

    public ObjectDemo(float gpa, int num) {
        this.gpa = gpa;
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(num);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(10.0f, 100);
        ObjectDemo obj2 = new ObjectDemo(7.0f, 100);

        // hashcode is a random numbers not address
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


        // equals
        if (obj1.equals(obj2))
            System.out.println("both value are equal");

        if (obj1 == obj2)
            System.out.println("both value are equal");




    }
}
