package leetcode;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LC1028 {
    /*
        Leetcode 1028. Recover a Tree from Preorder Traversal
        Tree, String
    */

    static TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0;

        while (i < traversal.length()) {

            // Count depth
            int depth = 0;
            while (i < traversal.length() && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            // Parse number
            int value = 0;
            while (i < traversal.length() && Character.isDigit(traversal.charAt(i))) {
                value = value * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(value);

            // Move up to correct parent
            while (stack.size() > depth) {
                stack.pop();
            }

            // Attach to parent
            if (!stack.isEmpty()) {
                TreeNode parent = stack.peek();

                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            }

            stack.push(node);
        }

        while (stack.size() > 1) {
            stack.pop();
        }

        return stack.peek();
    }

    static void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = recoverFromPreorder("1-2--3--4-5--6--7");
        printPreorder(root); // Output: 1 2 3 4 5 6 7
    }
}
