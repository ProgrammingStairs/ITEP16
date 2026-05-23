// example showing the concept of tree

import java.util.*;
class TreeDemo{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String args[]){
        TreeDemo tree = new TreeDemo();
        Node root = tree.new Node(10);
        System.out.println("Root : "+root.data);

        root.left = tree.new Node(20);
        root.right = tree.new Node(30);
        System.out.println("Root left : "+root.left.data);
        System.out.println("Root right : "+root.right.data);
        
        root.left.left = tree.new Node(15);
        root.left.right = tree.new Node(25);
        System.out.println("Root left left : "+root.left.left.data);
        System.out.println("Root left right : "+root.left.right.data);

    }
}