//https://open.kattis.com/problems/judgingmoose
import java.util.Scanner;
public class judgingmoose {
    public static void main(String[] args) {
        
        Scanner userScan = new Scanner(System.in);
        String[] number = userScan.nextLine().split(" ");

        

        int num1 = Integer.parseInt(number[0]);
        int num2 = Integer.parseInt(number[1]);

        //check if not a moose first, otherwise call method
        if(num1 == 0 && num2 ==0){
            System.out.println("Not a moose");
        } else {
            checkNumber(num1, num2);
        }
    }

    public static void checkNumber(int num1, int num2){
        boolean even = false, odd = false;
        //check if same number
        if(num1 == num2) {
            //Then is an even number
            System.out.println("Even " + (num1 + num2));
        } else {
            //Numbers are not the same, so check which is greatest and print the num * 2 and Odd
            if(num1 > num2) {
                System.out.println("Odd " + (num1*2));
            } else {
                System.out.println("Odd " + (num2*2));
            }
        }
    }
}