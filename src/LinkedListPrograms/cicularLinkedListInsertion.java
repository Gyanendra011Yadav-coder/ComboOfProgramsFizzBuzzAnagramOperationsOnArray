/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/6/2021
 *   Time: 10:45 AM
 *   File: cicularLinkedListInsertion.java
 */

package LinkedListPrograms;

import org.w3c.dom.Node;

public class cicularLinkedListInsertion {
    Node head;
    class Node{
        int data;
        Node next;
    }

    public void insert(Node newNode){
        if(head==null){
            head= newNode;
            newNode.next = head;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = temp.next;
        }
    }
}

