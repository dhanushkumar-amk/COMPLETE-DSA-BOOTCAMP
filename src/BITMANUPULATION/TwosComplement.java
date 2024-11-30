package BITMANUPULATION;

public class TwosComplement {
    public static void main(String[] args) {

    }

    public static String twosComplement(String str){
        StringBuilder builder = new StringBuilder();
    }

    public  static  String OnesComplement(String str){

        StringBuilder stringBuilder = new StringBuilder();

        for (char i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                stringBuilder.append('0');
            else
                stringBuilder.append('1');
        }

        return stringBuilder.toString();
    }
}
