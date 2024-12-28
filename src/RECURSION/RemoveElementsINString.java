package RECURSION;

public class RemoveElementsINString {
    public static void main(String[] args) {

        skip("", "abacde");

        //System.out.println(string("heloaaaoajgfg"));
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


    // iterative method
        static  String string(String s){

         String result = "";

            for (char i = 0; i <s.length() ; i++) {
                if (s.charAt(i) != 'a')
                    result += s.charAt(i);
            }

     return result;

    }
}
