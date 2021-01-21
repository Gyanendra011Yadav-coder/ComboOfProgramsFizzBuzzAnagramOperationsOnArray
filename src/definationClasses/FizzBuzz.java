package definationClasses;/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/20/2021
 *   Time: 3:46 PM
 *   File: definationClasses.FizzBuzz.java
 */

public class FizzBuzz {
    int array[] = new int[100];
    String string = " ";
    int number;
    FizzBuzz(){
        this.string ="";
    }
    public String fizzBuzz(){
        for (int index = 0; index <99 ; index++) {
            if(index % 3 ==0 && index % 5==0) {
                string = "FIZZ-BUZZ";
            }else if (index % 3 == 0) {
                    string = "FIZZ";
                } else if (index % 5 == 0) {
                    string = "BUZZ";
                } else if (index % 3 != 0 && index % 5 != 0) {
                    int number = index;
                }
            }
        return string;
    }


}

