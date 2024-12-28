package RECURSION;

public class RemoveElementsINString {
    public static void main(String[] args) {

        skip("", "abacde");

        StringBuilder s = string("helloaaaa");
        System.out.println(s.toString());
    }


    static void skip(String result, String original){

        if (original.isEmpty()){
            System.out.println(result);
            return;
        }

        char character  = original.charAt(0);

        if (character == 'a'){
            skip(result, original.substring(1));
        }
        else{
            skip(result + character, original.substring(1));
        }
    }
        static  StringBuilder string(String s){

        StringBuilder str = new StringBuilder();

            for (char i = 0; i <s.length() ; i++) {
                if (s.charAt(i) != 'a')
                    str.append(i);
            }

     return str;

    }
}
