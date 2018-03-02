/**
 * file: hashMapbing.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Tuesday, 27th February 2018 12:42:58 pm
 * modified: Tuesday, 27th February 2018 12:57:26 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/hashMapbing.java
 * comment: comment
 */
//
import java.util.*;
public class hashMapbing {
    public static void main (String[] args) {
        
    Scanner userScan = new Scanner(System.in);
    int number = userScan.nextInt();userScan.nextLine();
    String s;
    String[] st;
    
    //create the hashMap
 
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    
    for(int i = 0; i < number; i++){
        s = userScan.nextLine();//take in a word
        st = s.split("");//remove any spaces
        //check to see if the map contains the key s
        //if it does, retreive the key and add "", otherwise s is equal to 0
        s = myMap.containsKey(s)? myMap.get(s) + "": "0";
        System.out.println(s + "\n");
        s = "";

        for(int j = 0; j < st.length; j++){
            
            s = s + st[j];
            //check to see if key is in hashMap already
            if(myMap.containsKey(s)){
                myMap.put(s, myMap.get(s) + 1);//if it is, increment
                //amount of times it has appeared
            }
            else {
                myMap.put(s, 1);
                //otherwise, input the new String and state that 
                //it has now appeared once in the hashMap
            }


            
        }

    }
    
    







        
    }
}