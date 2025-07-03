package STRING;

public class FindTheKthCharacterInStringGameI {
    public static void main(String[] args) {
        FindTheKthCharacterInStringGameI ans = new FindTheKthCharacterInStringGameI();
        int k = 10;
        System.out.println(ans.kthCharacter(k));
    }
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k){
            int length = sb.length();
            for (int i = 0; i < length ; i++) {
                char c = sb.charAt(i);
                char nextCharacter = (char) (((c - 'a' + 1) % 26) + 'a');
                sb.append(nextCharacter);
            }
        }
        return  sb.charAt(k - 1);
    }
}
