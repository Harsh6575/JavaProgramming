package BTree;

public class Main {
    public static void main(String[] args) {
        BST2 tree = new BST2();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.prettyDisplay();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
