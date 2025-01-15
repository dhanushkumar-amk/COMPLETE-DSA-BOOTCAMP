package STRING;

import java.util.Arrays;

public class StringBuilderandStrings {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        String a = "dhanushkumar";
        String b = "dhanushkumar";

        a = "ram";

        System.out.println(a);
        System.out.println(b);

        // string pooling means store the same reference for a similar values

        // how to know the both the values is stored in same place
        String name1 = "ram";
        String name2 = "ram";

        System.out.println(name1 == name2);

        // create the seperate obj using new keyword
        String one = new String("hello");
        String two = new String("hello");

        // it checks the both values and reference value are same or not
        System.out.println(one == two); // false because we create seprate reference type

        System.out.println(one.equals(two)); // it only check values


        System.out.println( 56);

        int[] arr = new int[]{1,2,3,4};


        System.out.println(Arrays.toString(arr));




    }


}





