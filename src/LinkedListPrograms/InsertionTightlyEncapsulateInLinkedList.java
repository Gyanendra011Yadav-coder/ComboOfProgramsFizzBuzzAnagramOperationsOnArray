/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/22/2021
 *   Time: 9:48 PM
 *   File: InsertionTightlyEncapsulateInLinkedList.java
 */

// TIGHTLY_ENCAPSULATED_CLASS
package LinkedListPrograms;

public class InsertionTightlyEncapsulateInLinkedList {
    class LinkedList {
        Node head;
        class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }

            public void setData(int data) {
                this.data = data;

            }

            public int getData() {
                return data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }

        public void insertNode(Node newNode){
            if(head==null){
                head = newNode;
            }else{
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                    temp = newNode;
                    }
                }

            }

//            printing methods
        public void printMethod(){
            Node print = head;
            while(print.next==null){
                System.out.println(print.data);
                print=print.next;
            }
        }

        }


    }


