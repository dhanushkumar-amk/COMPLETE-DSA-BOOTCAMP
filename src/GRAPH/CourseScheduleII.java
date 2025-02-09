package GRAPH;


// https://leetcode.com/problems/course-schedule-ii/description/
// leetcode 210

import java.util.ArrayList;

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



    }
}
