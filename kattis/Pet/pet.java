//https://open.kattis.com/problems/pet
import java.util.Scanner;
public class pet {
    public static void main(String[] args) {
        
    Scanner user = new Scanner(System.in);
    int[] contestants = new int[5];
    int score = 0;
    int locationBestScore = 0;

    for(int i = 0; i < contestants.length; i++){ //run for 4 contestants

      for(int j = 0; j < 4; j++) {
          //each contestants score added up
          
         score += user.nextInt();

      }
      contestants[i] = score; //contestant j got a score of score
      if(i == 0) {
          locationBestScore = 0;
      } else {
          if(score > contestants[locationBestScore]){
              locationBestScore = i;//new best score
          }
      }
      score = 0;
    }
    int num = locationBestScore + 1;

    System.out.println(num + " " + contestants[locationBestScore]);

    }
}
