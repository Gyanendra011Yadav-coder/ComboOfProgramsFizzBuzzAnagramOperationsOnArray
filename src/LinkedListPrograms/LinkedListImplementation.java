package LinkedListPrograms;/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/3/2021
 *   Time: 4:08 PM
 *   File: LinkedListPrograms.LinkedListImplementation.java
 */

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LinkedListImplementation {
//    SINGLY LINKED LIST

    static class Node{
// primitive data types
        int data;
        Node next;
    }
    class node2{
//non-primitive data types
        Student data;
        Node nxt;
    }

class Student{
        int rollNo;
        String name;
        int marks;
}


//SINGLY LINKED LIST

    static class SinglyLinkedList{
        Node Head;              //it is a stance variable
        SinglyLinkedList(){
            Head = null;
        }
        public void insert(Node n1){
            if(Head==null){
                Head = new Node();
            }else{
                Node temp = Head;
                while (temp.next!=null){
                    temp = temp.next;
                }
                temp.next = new Node();

            }

        }
    }

    static class SinglyLinkedListMain{
        public static void main(String[] args) {
            SinglyLinkedList obj = new SinglyLinkedList();
            Node n1= new Node();
            n1.data=10;
            obj.insert(n1);
        }
    }


}

