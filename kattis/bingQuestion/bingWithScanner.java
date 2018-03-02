/**
 * file: bingWithScanner.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Saturday, 24th February 2018 11:09:25 pm
 * modified: Saturday, 24th February 2018 11:09:30 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/bingWithScanner.java
 * comment: comment
 */
//
import java.util.Scanner;
public class bingWithScanner{
public static void main (String[] args){
    Scanner userScan = new Scanner(System.in);
    String[] prevWords = new String[userScan.nextInt()];userScan.nextLine();
    boolean checker = true;
    int numTimes = 0;
    int counter = 0;
     for(int i = 0; i < prevWords.length; i++){
       String currentWord = userScan.nextLine();
        int current = 0;
        numTimes = 0;
            while(prevWords[current]!=null){
            checker = checkWords(prevWords[current], currentWord);
                if(checker)
                    numTimes++;
                current++;
            }
            System.out.println(numTimes);
            prevWords[counter++] = currentWord;
    }
    userScan.close();
}
public static boolean checkWords(String pastWord, String currentWord) {
    for(int i = 0; i < currentWord.length(); i++){
     if(i > pastWord.length()-1)
         return false;
        if(currentWord.charAt(i)!=pastWord.charAt(i))
            return false;
    }
   return true;
}
}