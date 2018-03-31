//link to Question: https://open.kattis.com/problems/pot
import java.util.*;
public class pot {
    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        int amount = userScan.nextInt();
        int result = 0;
        for(int i =0; i < amount;i++){
            String wordNum = userScan.next();
            char powchar = wordNum.charAt(wordNum.length()-1);
            int powNum = Character.getNumericValue(powchar);
            int num = Integer.parseInt(wordNum.substring(0, wordNum.length()-1));
            result += Math.pow(num, powNum);
        }
        System.out.println(result);
        userScan.close();    
    }
}
