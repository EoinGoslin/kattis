/**
 * file: simonactual.java
 * project: kattis
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Saturday, 10th February 2018 10:31:52 am
 * modified: Saturday, 10th February 2018 10:32:00 am
 * filepath: /home/eoin/Desktop/kattis/simonactual.java
 * comment: comment
 */
//
import java.util.Scanner;
public class simonactual {
    public static void main (String[] args) {
        
        Scanner userScan = new Scanner(System.in);
        int numTestCase = userScan.nextInt();userScan.nextLine();

        for(int i = 0; i < numTestCase; i++) {
            
             String[] command = userScan.nextLine().split(" ");

             if(checkForSimon(command)) {
                
                for(int j = 2; j < command.length;j++){
                    System.out.print(command[j] + " ");
                    
                }
                System.out.println(" ");



             } else {
                 System.out.println(" ");
             } 

        }

        userScan.close();

    }

    public static boolean checkForSimon(String[] command){

        if(command[0].equals("simon") && command[1].equals("says")){
            return true;
        }

        return false;


    }
}