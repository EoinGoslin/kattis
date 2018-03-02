/**
 * file: bingQuestion.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Saturday, 24th February 2018 6:00:18 pm
 * modified: Saturday, 24th February 2018 8:32:54 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/bingQuestion.java
 * comment: comment
 */
/*
*task is to analyze the stream of searches coming in, and let everyone know how
*many of these searches began with the letters currently in the search bar.
*/
/* Question: 
Input:
Each test case begins with a line with a single integer N. 
The following N lines each contain one word using only the characters a–z.
Output:
For each word, output an integer representing how many of the previous words began with or were equal to that word.
*/
import java.util.Scanner;
public class bingQuestion{
public static int counter = 0;
public static void main (String[] args){

    Scanner userScan = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int numLines = userScan.nextInt();userScan.nextLine();

    String[] prevWords = new String[numLines];
    boolean checker = true;
    int numTimes = 0;
    System.out.println("Enter a word");
    String currentWord = userScan.nextLine();
    System.out.println(0);
    prevWords[counter] = currentWord;
    counter++;
    

    for(int i = 0; i < numLines; i++){//take in all of the words
        
        //add word to lsit of previous words
        System.out.println("Enter a word");
        currentWord = userScan.nextLine();
            int current = 0;
            while(prevWords[current]!=null){
            
               checker = checkWords(prevWords[current], currentWord);
                if(checker){
                    numTimes = numTimes + 1;
                }
                current = current + 1;

            }
            
            
            
            System.out.println(numTimes);
            numTimes = 0;
            prevWords[counter] = currentWord;
            counter++;
        }
       
        

    

   

}

public static boolean checkWords(String pastWord, String currentWord) {

   
  
  for(int i = 0; i < currentWord.length(); i++){
     if(i > pastWord.length()-1){
         return false;
     }
        if(currentWord.charAt(i)!=pastWord.charAt(i)){
            return false;
        }
        
    }
   

     
     return true;

}
}


