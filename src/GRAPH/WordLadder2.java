package GRAPH;

// https://leetcode.com/problems/word-ladder-ii/
// letocde 126

import java.util.*;

public class WordLadder2 {
        public ArrayList<ArrayList<String>> findLadders(String startWord, String targetWord, String[] wordList){

            // create the set and ad elements in the set
            Set<String> set = new HashSet<>();

            int len = wordList.length;
            for (int i = 0; i < len; i++)
                set.add(wordList[i]);

            // create the queue and arraylist add startWord to it
            Queue<ArrayList<String>> queue = new LinkedList<>();
            ArrayList<String> list = new ArrayList<>();

            list.add(startWord);
            queue.add(list);

            // create the array list to add every level for operations
            ArrayList<String> everyLevelList = new ArrayList<>();
            everyLevelList.add(startWord);

            int level = 0;
            ArrayList<ArrayList<String>> answer = new ArrayList<>();

            while (!queue.isEmpty()){
                ArrayList<String > subAnswer = queue.poll();

                // if level will be increased hen earse the element from list
                if (subAnswer.size() > level){
                    level++;
                    for(String it : everyLevelList)
                        set.remove(it);
                }

                // get the lost word on the list and make operations
                String word = subAnswer.get(subAnswer.size() - 1);

                if (word.equals(targetWord)){
                    if (answer.size() == 0)
                        answer.add(subAnswer);
                    else if(answer.get(0).size() == subAnswer.size())
                        answer.add(subAnswer);
                }


                for (int i = 0; i < word.length(); i++) {
                    for (char ch = 'a'; ch <= 'z' ; ch++) {

                        char[] charReplacementArray = word.toCharArray();
                        charReplacementArray[i] = ch;

                        String replaceWord = new String(charReplacementArray);

                        // if the replace word is present in an set means take that word make the new sequence
                        if (set.contains((replaceWord))){
                            subAnswer.add((replaceWord));

                            ArrayList<String> temp = new ArrayList<>(subAnswer);
                            queue.add(temp);

                            everyLevelList.add(replaceWord);

                            // remove tha last word and check again for another possibility
                            subAnswer.remove(subAnswer.size() - 1);
                        }

                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
                "des",
                "der",
                "dfr",
                "dgt",
                "dfs"
        };

        WordLadder2 obj = new WordLadder2();
        ArrayList < ArrayList < String >> ans = obj.findLadders(startWord, targetWord, wordList);

        // If no transformation sequence is possible.
        if (ans.size() == 0)
            System.out.println(-1);
        else {

            Collections.sort(ans, new comp());
            for (int i = 0; i < ans.size(); i++) {
                for (int j = 0; j < ans.get(i).size(); j++) {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    }