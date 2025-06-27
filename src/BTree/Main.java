package BTree;

public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        int[] nums = {15,12,11,13,17,7,5,3};
        tree.populate(nums);
        tree.prettyDisplay();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
