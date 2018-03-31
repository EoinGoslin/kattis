//link to Question: https://open.kattis.com/problems/abc
import java.util.*;
public class abc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[3];
        numArray[0] = sc.nextInt();
        numArray[1] = sc.nextInt();
        numArray[2] = sc.nextInt();sc.nextLine();
        char[] letters = sc.next().toCharArray();
        Arrays.sort(numArray);
        for(int i = 0; i < 3;i++){
            switch(letters[i]){
                case 'A': System.out.print(numArray[0] + " ");
                break;
                case 'B': System.out.print(numArray[1] + " ");
                break;
                case 'C': System.out.print(numArray[2] + " ");
                break;
            }
        }
    }
}
