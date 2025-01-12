package OOPS.OBJECTCLONING;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }


    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

       // shallow copy

        Human kumar = (Human) super.clone();

        // make deep copy
        kumar.arr = new int[kumar.arr.length];
        System.arraycopy(this.arr, 0, kumar.arr, 0, kumar.arr.length);

        return kumar;
    }

}
