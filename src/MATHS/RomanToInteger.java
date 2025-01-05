package MATHS;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s =  "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int result = 0;
        for (int i = 0; i <s.length(); i++) {

            char ch = s.charAt(i);
            if (i + 1 < s.length()  && map.get(s.charAt(i + 1)) > map.get(ch)) {
                result += map.get(s.charAt(i - 1)) - map.get(ch);
                i+=1; // for going i= 2 steps then it will increase one time as loop and we manually increase one
            }
            else
                result += map.get(ch);
        }

    return result;
    }
}
