/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/16/2021
 *   Time: 2:26 AM
 *   File: ReverseTheLinkedList.java
 */

package LinkedListPrograms;

import java.sql.PreparedStatement;
import java.util.LinkedList;

public class ReverseTheLinkedList {
   static class Node{
        int Head;
        Node next;
        public Node (int newData){
            this.Head = newData;
            this.next = null;
        }
    }
//
    static class LinkedList {
    public Node Head;
//constructor of LinkedList Class
    public LinkedList() {
        this.Head = null;
    }

    //   INSERTION METHOD
    public void insertNode(int newData) {
        Node nodeObj = new Node(newData);
        if (this.Head != null) {
            nodeObj.next = Head;
        }
        this.Head = nodeObj;
    }
}



}


