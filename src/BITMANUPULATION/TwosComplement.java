package BITMANUPULATION;

public class TwosComplement {
    public static void main(String[] args) {
        String str = "1001";
        System.out.println("2's Complement of " + str + " is: " + twosComplement(str));
    }

    public static String twosComplement(String str) {
        // Step 1: Calculate 1's complement
        String onesComplement = onesComplement(str);

        // Step 2: Add 1 to the 1's complement
        StringBuilder builder = new StringBuilder(onesComplement);

        int carry = 1;
        for (int i = onesComplement.length() - 1; i >= 0; i--) {
            if (onesComplement.charAt(i) == '1' && carry == 1) {
                builder.setCharAt(i, '0');
            } else if (onesComplement.charAt(i) == '0' && carry == 1) {
                builder.setCharAt(i, '1');
                carry = 0;
            } else {
                break;
            }
        }

        // If carry is still 1, prepend '1' to the result (for overflow cases)
        if (carry == 1) {
            builder.insert(0, '1');
        }

        return builder.toString();
    }

    // Method to calculate 1's complement
    public static String onesComplement(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                stringBuilder.append('0');
            else
                stringBuilder.append('1');
        }

        return stringBuilder.toString();
    }
}
