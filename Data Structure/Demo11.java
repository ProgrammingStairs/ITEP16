// example showing the concept of linked list

import java.util.*;
class LinkedListDemo{
   class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
   } 
   public static void main(String args[]){
        LinkedListDemo list = new LinkedListDemo();
        Node first = list.new Node(100);
        Node second = list.new Node(200);
        Node third = list.new Node(300);
        
        first.next = second;
        second.next = third;

        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
   }
}