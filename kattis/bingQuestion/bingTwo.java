/**
 * file: bingTwo.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Saturday, 24th February 2018 9:31:44 pm
 * modified: Saturday, 24th February 2018 11:08:28 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/bingTwo.java
 * comment: comment
 */
//
import java.io.*;
public class bingTwo{
public static void main (String[] args) throws Exception{
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(istream);
    System.out.println("Enter:");
    String name = br.readLine();
    System.out.println(name);

    System.out.println("Enter number:");
    name = br.readLine();
    int number = Integer.parseInt(name);
    System.out.println(number*2);
    
    
}
}