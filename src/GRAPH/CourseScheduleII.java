package GRAPH;


// https://leetcode.com/problems/course-schedule-ii/description/
// leetcode 210

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <numCourses; i++) {
            list.add(new ArrayList<>());
        }

        int n = prerequisites.length;
        for (int i = 0; i <n ; i++) {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
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

        if (answer.length == n)

    }
}
