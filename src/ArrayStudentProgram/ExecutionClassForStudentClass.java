/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/31/2021
 *   Time: 12:05 PM
 *   File: ExecutionClassForStudentClass.java
 */

package ArrayStudentProgram;

import java.util.Scanner;

public class ExecutionClassForStudentClass {
    public static void main(String[] args) {
        counter();
    }

    public static void counter(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("-------WARNING--------");
        System.out.println("---ENTER THE INPUT IN THE SPECIFIC FORMAT---");
        System.out.println("FIRST,ENTER THE NAME OF THE STUDENT:-");
        System.out.println("2) ENTER THE MARKS IN THE SUBJECT1:-");
        System.out.println("3) ENTER THE MARKS IN THE SUBJECT2:-");
        System.out.println("4) ENTER THE MARKS IN THE SUBJECT3:-");


        Student array[] = new Student[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student(scannerObject.nextLine(),
                    scannerObject.nextInt(),
                    scannerObject.nextInt(),
                    scannerObject.nextInt());
            passFail(array[i]);
        }
    }
    /*

     */

    public static int passFail(Student studentObject){
        int counter = 0;
        if (studentObject.getMarksInSubject1()>40){
            counter += 1;
            if (studentObject.getMarksInSubject2() > 40){
                counter += 1;
                if (studentObject.getMarksInSubject3() > 40){
                    counter += 1;
                }
                if (counter>2){
                    System.out.println("STUDENT IS PASS");
                }else {
                    System.out.println("STUDENT IS FAIL");
                }
            }
        }

return counter;
    }

}


