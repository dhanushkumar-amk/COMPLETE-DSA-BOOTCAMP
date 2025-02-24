package STRING;

public class ZigZagConversion {

    public static void main(String[] args) {
        
    }

    public String convert(String s, int numRows) {

        int row = numRows;
        int col =  s.length();

        char[][] matrix = new char[row][col];

        int j = 0;
        int k = 0;

        while (k < s.length()){
            for (int i = 0; i < row; i++) {
                if (k == s.length())
                    break;
                matrix[i][j] = s.charAt(k);
                k++;
            }
            j++;

            for (int i = row - 2; i >= 1 ; i++) {
                if (k == s.length())
                    break;
                matrix[i][j] = s.charAt(k);
                j++;
                k++;
            }
        }

        String answer = "";

        for (int i = 0; i < row; i++) {
            for (int l = 0; l < col; l++) {
                answer += matrix[i][l];
            }
        }
        return answer;
    }
}
