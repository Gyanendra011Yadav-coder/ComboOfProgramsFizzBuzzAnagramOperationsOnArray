/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/3/2021
 *   Time: 3:25 PM
 *   File: RecursionProgram.java
 */

public class RecursionProgram {
    static void number(int m){
        if(m>0){
            System.out.println(m+" ");
            number(m-1);
        }
    }
    static void Head(int g){
        System.out.println(g);
        Head(g-1);

    }

    public static void main(String[] args) {
        int x=5;
        number(x);
    }


/*
PRINTING: THE FIRST 10 NATURAL NUMBER.
 */



}