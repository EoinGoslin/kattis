//Link to Question: https://open.kattis.com/problems/oddities
import java.util.*;
public class oddities {
   public static void main(String[] args) {
       Scanner userScan = new Scanner(System.in);
       int numTestCases = userScan.nextInt();
       boolean wasNeg = false;
       for(int i = 0; i < numTestCases;i++){
           int num = userScan.nextInt();
           if(num < 0){
               wasNeg = true;
               num = Math.abs(num);
           }
           if(Oddity(num)) {
               if(wasNeg){
                System.out.println("-" + num + " is even");
               } else {
                System.out.println(num + " is even");
               }
           } else {
            if(wasNeg){
                System.out.println("-" + num + " is odd");
               } else{
                System.out.println(num + " is odd");
               }
           }
           wasNeg = false;
       }
   }
   public static boolean Oddity(int n){
       for(int i =2; i <=10;i+=2){
           if(n%i==0){
               return true;
           }
       }
       return false;
   }
}