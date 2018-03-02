/**
 * file: quadrant.java
 * project: quadrant
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Friday, 2nd March 2018 10:37:18 am
 * modified: Friday, 2nd March 2018 12:30:28 pm
 * filepath: /home/eoin/Desktop/kattis/quadrant/quadrant.java
 * comment: comment
 */
//
/*Question 
*A common problem
*in mathematics is to determine which quadrant 
*a given point lies in.
* A, which is at coordinates (12,5) lies in quadrant 1
*since both its x and y values are positive, 
*and point B lies in quadrant 2 since its x 
*value is negative and its y value is positive.

*Output
*Output the quadrant number (1, 2, 3 or 4) for the point (x,y).
*/
import java.util.Scanner;
public class quadrant {
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        int x = userScan.nextInt();
        int y = userScan.nextInt();
        if(x > 0&&y>0){
            System.out.println(1);
        } else if(x < 0&&y>0){
            System.out.println(2);
        } else if(x < 0&&y<0){
            System.out.println(3);
        } else {
            System.out.println(4);
        } 
        userScan.close(); 
    }
}