/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 1/20/2021
 *   Time: 3:47 PM
 *   File: Anagram.java
 */

package definationClasses;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Anagram {
    String name1;
    String name2;

    public Anagram() {
        this.name1 = "RACE";
        this.name2 = "ACER";
    }

    public boolean checkAnagram() {
        boolean isAngram = false;
        char c;
        if (name1.length() == name2.length()) {
            for (int i = 0; i < name1.length(); i++) {
                c = name1.charAt(i);
                isAngram = false;
            }
            for (int j = 0; j < name2.length(); j++){
                c=name2.charAt(j);
                isAngram = true;
            }

        }
        return isAngram;


    }
}





