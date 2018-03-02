/**
 * file: usingSubstring.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Tuesday, 27th February 2018 11:13:41 am
 * modified: Tuesday, 27th February 2018 11:20:50 am
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/usingSubstring.java
 * comment: comment
 */
//
public class usingSubstring {
    public static void main (String[] args){
        

String pastWord = "adventure", newWord = "ad";
//substring is not inclusive of last number 

// System.out.println(pastWord.substring(0, 2));

System.out.println(pastWord.substring(0, newWord.length()));

if(pastWord.substring(0, newWord.length()).equals(newWord)){
    System.out.println("Starts with it");
}



        
    }
}

/*for(int i = 0; i < currentWord.length(); i++){
     if(i > pastWord.length()-1)
         return false;
        if(currentWord.charAt(i)!=pastWord.charAt(i))
            return false;
    }
   return true;*/
   