/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 2/3/2021
 *   Time: 3:25 PM
 *   File: RecursionProgram.java
 */

public class RecursionProgram {
    static void number(int m){
        if(m>0){
            int sum=1;


            for(int i=m ; i>0 ; i--){
                sum*=m;
            }
            System.out.println(sum);
//            System.out.println(m+" ");
////            number(m+1);
        }
    }

    public static void main(String[] args) {
        int x=5;
        number(x);
    }
}

