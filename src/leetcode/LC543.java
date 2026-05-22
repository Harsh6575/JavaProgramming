package leetcode;

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

public class LC543 {
     /*
        Leetcode 543. Diameter of Binary Tree
        Tree
    */

    private static int diameter = 0;

    static int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    private static int getDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = getDepth(node.left);
        int right = getDepth(node.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }
}
