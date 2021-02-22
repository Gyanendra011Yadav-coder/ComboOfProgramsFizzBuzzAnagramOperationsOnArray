/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/6/2021
 *   Time: 12:26 AM
 *   File: singlyLinkedListInsertion.java
 */

package LinkedListPrograms;

import org.w3c.dom.Node;

class LinkedList {


     static class Node {
        int data;
        Node next;
         private Node head;

         public Node(int d) {
            data = d;
            next = null;
        }

        public void insert(Node newNode) {
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                    temp.next = newNode;

                }
            }
        }

        public void printNode() {
            Node printValue = head;
            while (printValue.next == null) {
                System.out.println(printValue.data);
                printValue = printValue.next;
            }
        }

        public static void main(String[] args) {
            Node node1 = new Node(10);
            Node node2 = new Node(20);
            Node node3 = new Node(30);

            node1.next=node2;
            node2.next= node3;
            node3.next = null;

            LinkedList obj = new LinkedList();



        }
    }

}



