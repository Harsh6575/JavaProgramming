package leetcode;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class LC133 {

    /*
        Leetcode 133. Clone Graph
        DFS
    */

    static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node[] clonedNodes = new Node[101];

        return cloneDFS(node, clonedNodes);
    }

    private static Node cloneDFS(Node node, Node[] clonedNodes) {
        if (clonedNodes[node.val] != null) {
            return clonedNodes[node.val];
        }

        Node clonedNode = new Node(node.val);

        clonedNodes[node.val] = clonedNode;

        for (Node neighbor : node.neighbors) {
            clonedNode.neighbors.add(
                cloneDFS(neighbor, clonedNodes)
            );
        }

        return clonedNode;
    }

    static void printGraph(Node node, boolean[] visited) {
        if (node == null || visited[node.val]) {
            return;
        }

        visited[node.val] = true;

        System.out.print("Node " + node.val + " neighbors: ");

        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }

        System.out.println();

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        int[][] edges = {
            {2, 4},
            {1, 3},
            {2, 4},
            {1, 3}
        };

        Node[] nodes = new Node[5];

        for (int i = 1; i <= 4; i++) {
            nodes[i] = new Node(i);
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            nodes[u].neighbors.add(nodes[v]);
            nodes[v].neighbors.add(nodes[u]);
        }

        Node clonedGraph = cloneGraph(nodes[1]);

        System.out.println("Cloned Graph:");

        printGraph(clonedGraph, new boolean[101]);
    }
}