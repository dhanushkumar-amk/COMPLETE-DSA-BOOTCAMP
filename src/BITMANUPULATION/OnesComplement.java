package BITMANUPULATION;


public class OnesComplement {
    public static void main(String[] args) {
        String num = "111111";
        System.out.println(Complement(num));
    }
   public static String Complement(String num){

       StringBuilder builder = new StringBuilder();

       for (char i = 0; i <num.length() ; i++) {
           if (num.charAt(i) == '0')
               builder.append('1');
           else
               builder.append('0');
       }
    return  builder.toString();
   }
}
