package TREES;

import java.util.ArrayList;
import java.util.List;

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

    }
}
