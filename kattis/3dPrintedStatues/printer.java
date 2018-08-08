//Kattis Question - https://open.kattis.com/problems/3dprinter
import java.util.Scanner;

public class printer {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int statsNeeded = user.nextInt();
        if(statsNeeded < 1) {
            System.out.println("0");
        } else {

        
        int minPrinters = (statsNeeded-1)/2;
        int days = 0, printCount = 1;
        int numStatues = 0;
        boolean flag = true;

        while(printCount <= minPrinters) {//make the printers
                days++; //each day a printer is made
                printCount += printCount;
                
            }
            while(flag) { //will keep going until statue need met
            
                if(numStatues < statsNeeded) {
                    days+=1;
                    numStatues += printCount;
                } else {
                    
                    flag = false;
                }
            }
            System.out.println(days);
    }
}
}