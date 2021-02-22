/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/16/2021
 *   Time: 2:26 AM
 *   File: ReverseTheLinkedListUsingRecursion.java

 */

package LinkedListPrograms;

import org.w3c.dom.Node;

class ReverseTheLinkedList {

    static class Node {
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }

        static Node reverse(Node head){
            if(head==null || head.next==null){
                return head;
            }else {
                Node rest = reverse(head.next);
                head.next.next.next = head;
                head.next = null;
            }
            return reverse(head);
        }


    }


}






    






