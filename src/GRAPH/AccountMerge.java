package GRAPH;

import MATRIX.SearchInTwoDMatrix;

import java.util.*;

// leetcode 721
// https://leetcode.com/problems/accounts-merge/

public class AccountMerge {

    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public AccountMerge(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

        public List<List<String>> accountsMerge(List<List<String>> accounts) {

            int n = accounts.size();
            AccountMerge ds = new AccountMerge(n);

            // create hashmap and put tha value on it
            HashMap<String, Integer> mailMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < accounts.get(i).size(); j++) {
                    String mail = accounts.get(i).get(j);

                    if (!mailMap.containsKey(mail))
                        mailMap.put(mail, i);
                    else
                        ds.unionBySize(i, mailMap.get(mail));
                }
            }

            // no get the value from the map and merge them
            ArrayList<String>[] mergeMail = new ArrayList[n];

            for (int i = 0; i < n; i++)
                mergeMail[i] = new ArrayList<>();

            for (Map.Entry<String, Integer> it : mailMap.entrySet()){
                String mail = it.getKey();
                int node = ds.findUPar(it.getValue());
                mergeMail[node].add(mail);
            }

            List<List<String>> answer = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                // if list doesn't not have answer simply skip
                if (mergeMail[i].size() == 0)
                    continue;

                Collections.sort(mergeMail[i]);

                List<String> temp =  new ArrayList<>();
                temp.add(accounts.get(i).get(0));

                for(String it : mergeMail[i])
                    temp.add(it);

                answer.add(temp);
            };

            return answer;
        }



    public static void main (String[] args) {
        List<List<String>> accounts = new ArrayList() {
            {
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j2@com", "j3@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j4@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r1@com", "r2@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j5@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r2@com", "r3@com")));
                add(new ArrayList<String>(Arrays.asList("Mary", "m1@com")));

            }
        };

        AccountMerge obj = new AccountMerge();
        List<List<String>> ans = obj.accountsMerge(accounts);

        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i).get(0) + ": ");
            int size = ans.get(i).size();
            for (int j = 1; j < size; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }

            System.out.println("");
        }

    }
}
