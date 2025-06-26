package BTree;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public int getValue() {
            return value;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public BST(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left Child of "+node.getValue());
        display(node.right, "Right Child of "+node.getValue());
    }


}
