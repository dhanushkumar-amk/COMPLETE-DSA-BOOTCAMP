package MATRIX;

//leetcode 2570
// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02

import java.util.ArrayList;

public class MergeTwo2DArraysBySummingValues {

    public static void main(String[] args) {
        MergeTwo2DArraysBySummingValues solution = new MergeTwo2DArraysBySummingValues();

        int[][] num1 = {
                {1,2},
                {2,3},
                {4,5},
        };

        int[][] num2 = {
                {1,4},
                {3,2},
                {4,1},
        };

        int[][] answer = solution.mergeArrays(num1, num2);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length,n2=nums2.length,i=0,j=0;
        ArrayList<int []> ans=new ArrayList();
        while(i<n1&& j<n2){
            if(nums1[i][0]==nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans.add(nums1[i]);
                i++;
            }
            else{
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<n1){
            ans.add(nums1[i++]);
        }
        while(j<n2){
            ans.add(nums2[j++]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
