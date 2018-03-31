import java.util.*;
public class tolower {
    public static void main (String[] args) {
       
        Scanner userScan = new Scanner(System.in);
        int numProblems = userScan.nextInt();
        int numTestCases = userScan.nextInt();userScan.nextLine();

        
        int counter = 0;
        for(int i= 0; i < numProblems;i++){
            boolean willSolve = true;
            for(int j = 0; j < numTestCases;j++){

                String word = userScan.nextLine();

                for(int k = 1;k< word.length();k++){
                    if(!Character.isLowerCase(word.charAt(k))) {

                        willSolve = false;


                    }
                }

            }

            if(willSolve){
                counter++;
            }
            
        }
        System.out.println(counter);

    }
}