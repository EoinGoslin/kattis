//https://open.kattis.com/problems/aboveaverage
import java.util.Scanner;
import java.text.DecimalFormat;
public class aboveaverage {
    private static DecimalFormat df2 = new DecimalFormat(".###");
    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        int number = userScan.nextInt();
        double average = 0;
        double counter = 0;
        
        for(int i = 0; i < number; i++) {
            average = 0;
            counter = 0;
            //each test case accessed in this loop
            
            int grades[] = new int[userScan.nextInt()];
            for(int j = 0; j < grades.length; j++){
                //each grade will be accessed in this loop
                //get all grades, then get average, then 
                //check all grades to see how many above
                grades[j] = userScan.nextInt();
                average += grades[j];

            }
            //all grades taken
            average = average/grades.length;
          
            //get how many above average
            for(int k = 0; k < grades.length; k++){
                if(grades[k] > average) {
                    counter++;//a person is above or equal to average
                }
            }
            double answer = (counter/grades.length) * 100;
            System.out.println(String.format("%.3f", answer) + "%"); 
        }
    }
}

