import java.util.Scanner;

public class timeloop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numSpells = sc.nextInt();
        for(int i =1; i <=numSpells;i++){
            System.out.println(i + " Abracadabra");
        }
    }
}