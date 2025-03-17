package STRING;


// leetcode : 2864
//  https://leetcode.com/problems/maximum-odd-binary-number/description/

public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {

        // count the total zero's and count the total ones
        int zeroCount = 0;
        int oneCount = 0;

        for(char c : s.toCharArray()){
            if (c == '0')
                zeroCount++;
            else
                oneCount++;
        }

        StringBuilder answer = new StringBuilder();

        // add the first one
        answer.append("1");
        oneCount--;

         // then add the all zeros
        while(zeroCount != 0){
            answer.append("0");
            zeroCount--;
        }

        /* shortcut =>  answer.append("0".repeat(zeroCount))  */

        // then add the all ones
        while(oneCount != 0){
            answer.append("1");
            oneCount--;
        }

        return answer.reverse().toString();
    }
}
