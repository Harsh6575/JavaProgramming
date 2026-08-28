package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC207 {

    /*
        Leetcode 207. Course Schedule
        Graph DFS
    */

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, visited, onPath, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasCycle(List<List<Integer>> graph, boolean[] visited, boolean[] onPath, int course) {
        if (onPath[course]) {
            return true; // Cycle detected
        }
        if (visited[course]) {
            return false; // Already visited
        }

        visited[course] = true;
        onPath[course] = true;

        for (int neighbor : graph.get(course)) {
            if (hasCycle(graph, visited, onPath, neighbor)) {
                return true;
            }
        }

        onPath[course] = false; // Backtrack
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{1, 0}})); // true
        System.out.println(canFinish(2, new int[][]{{1, 0}, {0, 1}})); // false
    }
}