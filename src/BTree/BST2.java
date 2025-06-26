package BTree;

public class BST2 {
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
        System.out.println(details + node.value);
        display(node.left, "Left Child of "+node.value +" = ");
        display(node.right, "Right Child of "+node.value +" = ");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i = 0; i <level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }

        if(value<node.getValue()){
            node.left = insert(value,node.left);
        }

        if(value>node.getValue()){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums){
        for (int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

}
