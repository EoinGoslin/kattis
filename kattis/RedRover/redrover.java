/**
 * file: redrover.java
 * project: RedRover
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Friday, 2nd March 2018 12:01:53 pm
 * modified: Friday, 2nd March 2018 1:35:12 pm
 * filepath: /home/eoin/Desktop/kattis/RedRover/redrover.java
 * comment: comment
 */
//
import java.util.Scanner;
public class redrover {
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        //Take in the instructions e.g. WNEENWEENEENE
        String instructions = userScan.nextLine();userScan.close();
        System.out.println(instructions);
        char[] instructArray = new char[instructions.length()];
       for(int i = 0; i < instructArray.length;i++){
           instructArray[i] = instructions.charAt(i);
       }
    }
    //how many times a character comes up
    public static int getCount(char letter, char[]array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(letter==array[i]){
                count++;
            }
            
        }
        return count;
    }
}