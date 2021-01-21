package definationClasses;/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/20/2021
 *   Time: 3:46 PM
 *   File: definationClasses.FizzBuzz.java
 */

public class FizzBuzz {
    String string;
    int number;

    public FizzBuzz() {
        this.string = " ";
        this.number = 0;
    }

    public String fizzBuzz() {
        for (int index = 0; index < 99; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                string = "FIZZ-BUZZ";
            } else if (index % 3 == 0) {
                string = "FIZZ";
            } else if (index % 5 == 0) {
                string = "BUZZ";
            } else if (index % 3 != 0 && index % 5 != 0) {
                int number = index;
                string = Integer.toString(number);
            }

        }
        return string;


    }
}


