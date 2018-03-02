import java.util.Scanner;

/**
 * control D to select all the variables
 * file: SimonSays.java
 * project: kattis
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Friday, 9th February 2018 7:30:13 pm
 * modified: Friday, 9th February 2018 8:27:52 pm
 * filepath: /home/eoin/Desktop/kattis/SimonSays.java
 * comment: comment
 */
//
public class SimonSays {
    public static void main (String[] args) {
        
        Scanner userScan = new Scanner(System.in);
        System.out.println("Please enter number of commands : ");
        int numTestCase = userScan.nextInt();userScan.nextLine();


        for(int i = 0; i < numTestCase; i++) {
            
             System.out.println("Enter a string :");
             String[] command = userScan.nextLine().split(" ");

             if(checkForSimon(command)) {
                
                for(int j = 2; j < command.length;j++){//start i on 2 as 0 and 1 are [simon][says]
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