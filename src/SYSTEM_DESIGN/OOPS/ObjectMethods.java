package SYSTEM_DESIGN.OOPS;

public class ObjectMethods {
    
    int num;

    public ObjectMethods(int num) {
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
        return super.hashCode();
    }

    public ObjectMethods() {
        super();
    } 

    @Override
    public String toString() {
        return super.toString();
    }
}
