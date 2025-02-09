package GRAPH;


// https://leetcode.com/problems/course-schedule-ii/description/
// leetcode 210

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {

    public static int[] findOrder(int numCourses, ArrayList<ArrayList<Integer>> prerequisites) {
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

        if (answer.length == numCourses)
            return answer;

        return new int[]{};

    }

    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            prerequisites.add(i, new ArrayList<>());
        }


        prerequisites.get(0).add(0);
        prerequisites.get(0).add(1);

        prerequisites.get(1).add(1);
        prerequisites.get(1).add(2);

        prerequisites.get(2).add(2);
        prerequisites.get(2).add(3);

        int[] ans = CourseScheduleII.findOrder(N, prerequisites);

        for (int task : ans) {
            System.out.print(task + " ");
        }
        System.out.println("");
    }
}
