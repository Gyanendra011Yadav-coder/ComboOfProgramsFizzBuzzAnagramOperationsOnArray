/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/20/2021
 *   Time: 3:48 PM
 *   File: ExecutionClass.java
 */

package MainClass;

import com.sun.jdi.PathSearchingVirtualMachine;
import definationClasses.Anagram;
import definationClasses.FizzBuzz;
import definationClasses.OperationsOnArray;

import java.util.Scanner;

public class ExecutionClass {
    public static final int EXIT=5;
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("=====WELCOME___TO___COMBO___PROGRAMS=====");
        System.out.println("PLEASE ENTER YOUR CHOICES BETWEEN 1 TO 4");
        System.out.println("PRESS::::1--->FOR THE EXECUTION OF THE PROGRAM OF 1 'ANAGRAM'");
        System.out.println("PRESS::::2--->FOR THE EXECUTION OF THE PROGRAM OF FIZZ-BUZZ");
        System.out.println("PRESS::::3---> FOR THE EXECUTION OF THE PROGRAM OF PERFORMING " +
                "OPERATIONS ON THE ARRAY");
        System.out.println("PRESS::::4--->FOR THE EXECUTION FOR THE PROGRAM OF TABLE:");
        System.out.println("PRESS::::5--->TO'''''EXIT'''''");
        int choice = scannerObject.nextInt();

        if (choice <= 5 && choice > 0) {
            switch (choice) {
                case 1:
                    Anagram anagramObject = new Anagram();
                    break;
                case 2:
                    FizzBuzz fizzBuzzObject =  new FizzBuzz();
                    break;
                case 3:
                    OperationsOnArray arrayObject = new OperationsOnArray();
                    scannerObject.nextInt();
                    break;
                case 4:

                    break;
                case EXIT:
                    break;
            }


        }
    }
}

