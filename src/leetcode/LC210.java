package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC210 {

    /*
        Leetcode 210. Course Schedule II
        Graph DFS + Topological Sort
    */

    static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses];
        int[] order = new int[numCourses];
        int[] index = {numCourses - 1};

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (!dfs(graph, visited, onPath, order, index, i)) {
                    return new int[0];
                }
            }
        }

        return order;
    }

    private static boolean dfs(
            List<List<Integer>> graph,
            boolean[] visited,
            boolean[] onPath,
            int[] order,
            int[] index,
            int course
    ) {
        if (onPath[course]) {
            return false;
        }

        if (visited[course]) {
            return true;
        }

        visited[course] = true;
        onPath[course] = true;

        for (int neighbor : graph.get(course)) {
            if (!dfs(graph, visited, onPath, order, index, neighbor)) {
                return false;
            }
        }

        onPath[course] = false;
        order[index[0]--] = course;

        return true;
    }

    public static void main(String[] args) {
        int[] order1 = findOrder(2, new int[][]{{1, 0}});
        for (int course : order1) {
            System.out.print(course + " ");
        }
        System.out.println(); // 0 1

        int[] order2 = findOrder(
                4,
                new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}
        );
        for (int course : order2) {
            System.out.print(course + " ");
        }
        System.out.println(); // Valid: 0 2 1 3, for example

        int[] order3 = findOrder(1, new int[][]{});
        for (int course : order3) {
            System.out.print(course + " ");
        }
        System.out.println(); // 0

        int[] order4 = findOrder(2, new int[][]{{1, 0}, {0, 1}});
        System.out.println(order4.length); // 0 (cycle)
    }
}
