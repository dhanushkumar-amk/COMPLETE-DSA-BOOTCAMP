package HASHMAPS;

import java.awt.*;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
       /* String name = "dhanush";
        int code = name.hashCode();
        System.out.println(code);
        System.out.println(code);

        */
        HashMap<String, Integer> map = new HashMap<>();

        map.put("dhanush", 100);
        map.put("ram", 56);
        map.put("kunal", 87);
        map.put("raj", 20);

        System.out.println(map.get("raj"));

        // search it present give that value, not present give default value you assign
        System.out.println(map.getOrDefault("arun", 49));

        // check if the key is present or not
        System.out.println(map.containsKey("dhanush"));

    }
}

