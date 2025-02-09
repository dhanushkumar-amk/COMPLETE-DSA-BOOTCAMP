package GRAPH;

import java.util.ArrayList;

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

    }
}
