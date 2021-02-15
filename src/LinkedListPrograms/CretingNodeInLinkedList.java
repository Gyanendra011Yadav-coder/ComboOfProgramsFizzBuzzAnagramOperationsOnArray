package LinkedListPrograms;/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/4/2021
 *   Time: 1:21 PM
 *   File: LinkedListPrograms.CretingNodeInLinkedList.java
 */

public class CretingNodeInLinkedList {
    Node Head;


    static class Node{
        int Data;
        Node Next;
        Node(int n){
            Data = n;
            Next = null;

        }
    }

    public static void main(String[] args) {
        CretingNodeInLinkedList obj = new CretingNodeInLinkedList();
        obj.Head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        obj.Head.Next = node2;
        node2.Next = node3;
        node3.Next = new Node(4);
        node4.Next = new Node(5);
        node5.Next = new Node(6);
        node6.Next = new Node(1);


    }

}

