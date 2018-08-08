import java.util.Scanner;
public class cold {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int numbers = user.nextInt();
        int belowZero = 0;

        for(int i = 0; i < numbers;i++) {
            int temp = user.nextInt();
            if(temp < 0) {
                belowZero++;
            }
        }
        System.out.println(belowZero);
    }
}