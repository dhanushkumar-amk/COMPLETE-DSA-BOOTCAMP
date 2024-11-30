package BITMANUPULATION;

public class TwosComplement {
    public static void main(String[] args) {
    String str = "1001";
        System.out.println(twosComplement(str));
    }

    public static String twosComplement(String str) {

        String onesComplement = OnesComplement(str);

        StringBuilder builder = new StringBuilder(onesComplement);

        int carry = 1;
        for (int i = str.length() - 1; i > 0; i++) {
            if (str.charAt(i) == '1' && carry == 1) {
                builder.setCharAt(i, '0');
            } else if (str.charAt(i) == '0' && carry == '1') {
                builder.setCharAt(i, '1');
                carry = 0;
            }else {
                break;
            }

        }

        // still last digit the carry == 1 then we put last digit as 1
        if (carry == 1) {
            builder.insert(0, '1');
        }
        return builder.toString();
    }

    public static String OnesComplement(String str) {

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
