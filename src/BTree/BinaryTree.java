package BTree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();

        root=new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of "+ node.value +" true or false");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value left of "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("Do you want to enter right of "+ node.value +" true or false");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value right of "+ node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indentation){
        if(node==null){
            return;
        }
        System.out.println(indentation + node.value);
        display(node.left, indentation+"\t");
        display(node.right, indentation+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node,int level){
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree btree = new BinaryTree();

        btree.populate(sc);
        btree.display();
        btree.prettyDisplay();
    }
}
