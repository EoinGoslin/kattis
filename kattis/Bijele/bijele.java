
//link to Question: https://open.kattis.com/problems/bijele
import java.util.*;
public class bijele{
    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        int number = userScan.nextInt(), i = 0;
        int[] pieces = new int[6];

        while(number!=0){
            pieces[i] = number%10;
            number /=10;
            i++;
        }
        
       
    }
}
