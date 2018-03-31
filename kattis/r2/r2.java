//Link to Question: https://open.kattis.com/problems/r2
import java.util.Scanner;
public class r2 {
    public static void main(String[] args){
        Scanner userScan = new Scanner(System.in);
        int R1 = userScan.nextInt(), S = userScan.nextInt();
        int R2 = (S*2) - R1;
        System.out.println(R2);
}
}
