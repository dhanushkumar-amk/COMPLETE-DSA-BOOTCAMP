package STRING;

import java.util.Arrays;

public class StringBuilderandStrings {
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


        // to string method
        System.out.println(Arrays.toString(arr));

        // pretty printing
        float z = 453.3547f;
        System.out.printf("formatted num is %.2f", z); // % place holder .2f . after 2 digit and it as a float

        System.out.println();
        System.out.printf(" %.3f",Math.PI);

        System.out.println();
        System.out.printf("hello my name is %s, i am so %s", "dhanush", "cool");

        System.out.println();

        // string operators
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 'b'); // ab
        System.out.println("a" + 5); // a5 // int can convert into Integer wrapper class it calls toString() method
        System.out.println('a' + 5);  // 102
        System.out.println((char) ('a' + 5)); // f

        // concat method
        System.out.println(a.concat(b));


        // string performance
        String series = "";

        for (int i = 0; i < 26 ; i++) {
            char ch = (char)  ('a' + i);
            System.out.print( ch + " ");
            series += ch;
        }
        System.out.println();
        System.out.println(series);

    }


}





