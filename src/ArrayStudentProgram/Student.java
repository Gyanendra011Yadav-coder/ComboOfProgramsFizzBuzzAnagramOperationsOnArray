package ArrayStudentProgram;/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/27/2021
 *   Time: 4:20 PM
 *   File: studentProgram.java
 */

import java.util.Scanner;

public class Student {

        String studentName;
        int marksInSubject1;
        int marksInSubject2;
        int  marksInSubject3;
        Scanner scannerObject = new Scanner (System.in);
        public Student(String studentName,int marksInSubject1,int marksInSubject2,int marksInSubject3){
            this.studentName=studentName;
            this.marksInSubject1 = marksInSubject1;
            this.marksInSubject2=marksInSubject2;
            this.marksInSubject3=marksInSubject3;
        }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarksInSubject1() {
        return marksInSubject1;
    }

    public void setMarksInSubject1(int marksInSubject1) {
        this.marksInSubject1 = marksInSubject1;
    }

    public double getMarksInSubject2() {
        return marksInSubject2;
    }

    public void setMarksInSubject2(int marksInSubject2) {
        this.marksInSubject2 = marksInSubject2;
    }

    public double getMarksInSubject3() {
        return marksInSubject3;
    }

    public void setMarksInSubject3(int marksInSubject3) {
        this.marksInSubject3 = marksInSubject3;
    }
}



