/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/10/2021
 *   Time: 2:53 PM
 *   File: CreationOfLinkedList.java
 */

package LinkedListPrograms;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreationOfLinkedList {

    static void printMethod(Node newNode) {
        while (newNode != null) {
            System.out.println(newNode.Data + " ");
            newNode = newNode.nextNode;
        }
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        Node head = null;
        Node Node1 = null;
//CREATING THE MEMORY IN THE HEAP.
        head = new Node();
        Node1 = new Node();


        head.Data = scannerObject.nextInt();
        head.nextNode= Node1;

        Node1.Data = scannerObject.nextInt();
        Node1.nextNode= null;

        printMethod(head);

    }

    static class Node {
        int Data;
        Node nextNode;
    }

//    // Structure of Node
//    static class Node
//    {
//        int data;
//        Node next;
//    };
//
//    // Function to print the content of
//// linked list starting from the
//// given node
//    static void printList(Node n)
//    {
//        // Iterate till n reaches null
//        while (n != null)
//        {
//            // Print the data
//            System.out.print(n.data + " ");
//            n = n.next;
//        }
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        Node head = null;
//        Node second = null;
//        Node third = null;
//
//        // Allocate 3 nodes in
//        // the heap
//        head = new Node();
//        second = new Node();
//        third = new Node();
//
//        // Assign data in first
//        // node
//        head.data = 1;
//
//        // Link first node with
//        // second
//        head.next = second;
//
//        // Assign data to second
//        // node
//        second.data = 2;
//        second.next = third;
//
//        // Assign data to third
//        // node
//        third.data = 3;
//        third.next = null;
//
//        printList(head);
}




