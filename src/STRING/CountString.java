package STRING;

public class CountString {
    public static void main(String[] args) {
        String s = "xxyyyyyzzzzzzz";
        count(s);
    }

    static  void count(String s){

        int xcount  = 0;
        int ycount = 0;
        int zcount = 0;

        for (char i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == 'x')
                xcount++;

            if (s.charAt(i) == 'y')
                ycount++;

            if (s.charAt(i) == 'z')
                zcount++;
        }

        System.out.println(xcount);
        System.out.println(ycount);
        System.out.println(zcount);
    }

}
