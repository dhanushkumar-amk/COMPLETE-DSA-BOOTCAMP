package RECURSION;

public class RemoveElementsINString {
    public static void main(String[] args) {

        skip("", "abacde");
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

}
