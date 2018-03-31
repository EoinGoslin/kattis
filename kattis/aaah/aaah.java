/*
 * file: aaah.java
 * project: aaah
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Thursday, 29th March 2018 3:34:59 pm
 * modified: Thursday, 29th March 2018 3:41:25 pm
 * filepath: /home/eoin/Desktop/kattis/aaah/aaah.java
 * comment: comment
 */

 import java.util.*;
public class aaah {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String jonA = sc.next(), docA = sc.next();
        if(jonA.length() >=docA.length()){
            System.out.println("go");
        } else {
            System.out.println("no");
        }
        
    }
}