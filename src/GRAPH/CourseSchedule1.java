package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/course-schedule/description/
//leetcode  207
public class CourseSchedule1 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <numCourses; i++) {
            list.add(new ArrayList<>());
        }

        int n = prerequisites.length;
        for (int i = 0; i <n ; i++) {
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }


        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {
            for(int it : list.get(i)){
                inDegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0)
                queue.add(i);
        }

        int i = 0;
        int[] answer = new int[numCourses];
        while (!queue.isEmpty()){
            int node = queue.poll();
            answer[i] = node;
            i++;

            for(int it : list.get(node)){
                inDegree[it]--;

                if (inDegree[it] == 0)
                    queue.add(it);
            }
        }

        if (answer.length == numCourses)
            return true;

        return false;
    }


    public static void main(String[] args) {
        int N = 4;
        int[][] prerequisites = new int[3][2];
        prerequisites[0][0] = 1;
        prerequisites[0][1] = 0;

        prerequisites[1][0] = 2;
        prerequisites[1][1] = 1;

        prerequisites[2][0] = 3;
        prerequisites[2][1] = 2;

        CourseSchedule1 obj = new CourseSchedule1();
        boolean ans = obj.canFinish(N, prerequisites);
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
