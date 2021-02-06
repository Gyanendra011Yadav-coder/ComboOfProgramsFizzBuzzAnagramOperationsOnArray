/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/6/2021
 *   Time: 12:26 AM
 *   File: singlyLinkedListInsertion.java
 */

package LinkedListPrograms;

public class singlyLinkedListInsertion {
    Node head;
   class Node {
       int data;
       Node next;
   }

   public void insert(Node newNode){
    if(head==null){
        head = newNode;
    }else{
        Node temp = head;
        while (temp.next!=null){
            temp =temp.next;
        }
        temp.next = newNode;
    }
   }



}

