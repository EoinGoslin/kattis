//https://open.kattis.com/problems/lineup
import java.util.Scanner;
//number greater than zero if first number comes after
public class lineup {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int numPeople = user.nextInt(); user.nextLine();//clear line
        String answer = "";
        String name[] = new String[numPeople];

        for(int i = 0; i < numPeople; i++){
            name[i] = user.nextLine();//get first name
        } 
        for(int i = 0; i < numPeople; i++){
            if(i > 0){

            
            if(name[i-1].compareTo(name[i])>0) {//last name comes after
                if(answer.equals("INCREASING")) {
                    answer = "NEITHER";
                    break;
                } else {

                
                answer = "DECREASING";
                }
            } else if(name[i-1].compareTo(name[i]) <0) {
                if(answer.equals("DECREASING")){
                    answer = "NEITHER";
                    
                    break;
                } else {

                
                answer = "INCREASING";

                }
            }
        }
        }
        System.out.println(answer);
       
    }
}
