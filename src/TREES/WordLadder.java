package TREES;

import java.util.*;

public class WordLadder {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        String beginWord = "hit";
        String endWord = "cog";

        System.out.println(ladderLength(beginWord, endWord, wordList));

    }

    public  static  int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) return 0;

        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int length = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            length++;

            for (int i = 0; i <size; i++) {
                String current = queue.poll();

                for (int j = 0; j <current.length(); j++) {

                    char[] temp = current.toCharArray();
                    
                    for (char ch = 'a'; ch <= 'z'; ch++ ){
                        temp[j] = ch;
                        String newWord = new String(temp);

                        if (newWord.equals(endWord))
                            return length + 1;

                        if (wordList.contains(newWord) && !visited.contains(newWord)){
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
