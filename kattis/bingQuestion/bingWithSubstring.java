/**
 * file: bingWithSubstring.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Tuesday, 27th February 2018 12:57:56 pm
 * modified: Tuesday, 27th February 2018 12:58:12 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/bingWithSubstring.java
 * comment: comment
 */
//
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
public class bingWithSubstring{
public static void main (String[] args)throws Exception{
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(istream);
    String num = br.readLine();
    int number = Integer.parseInt(num);
    String[] prevWords = new String[number];
    boolean checker = true;
    int numTimes = 0, counter = 0,current = 0;
     for(int i = 0; i < prevWords.length; i++){
       String currentWord = br.readLine();
            while(prevWords[current]!=null){
            checker = checkWords(prevWords[current], currentWord);
                if(checker)
                    numTimes++;
                current++;
            }
            System.out.println(numTimes);
            prevWords[counter++] = currentWord;
            current = 0;
             numTimes = 0;
    }
}
public static boolean checkWords(String pastWord, String currentWord) {
    if(currentWord.length() > pastWord.length())
         return false;
    if(pastWord.subSequence(0, currentWord.length()).equals(currentWord)){
        return true;
    }
    return false;
}
}





