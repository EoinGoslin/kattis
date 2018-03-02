import java.util.*;
/**
 * file: hashMap.java
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Tuesday, 27th February 2018 12:20:40 pm
 * modified: Tuesday, 27th February 2018 1:00:51 pm
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/hashMap.java
 * comment: comment
 */
//
public class hashMap {
    public static void main (String[] args) {
//IMPORTANT!..To use hashMap must - import java.util.*
//how to declare a hashmap
HashMap<Integer, String> myMap = new HashMap<Integer, String>();
//Integer is the key and the String is the value
//Every key will have a value asssociated with it
//adding values into the map
myMap.put(1, "Eoin");
myMap.put(2, "Jess");
myMap.put(3, "Emma");
myMap.put(4, "Kevin");
//To display a single value, must use get the key and then will be
//able to retrieve the value associated with that key
String first = myMap.get(1);
System.out.println(first);//will print eoin

//one way to iterate through the map
//i is the name of the iterator
//myMap is name of hashMap
//will print :
/*
1 Eoin
2 Jess
3 Emma
4 Kevin
*/

//What i:myMap means is that i will iterate through the hashMap called myMap
//needeed so that i knows which hashMap to iterate through

for(Map.Entry i:myMap.entrySet()) {
    System.out.println(i.getKey() + " " + i.getValue());
   
}
System.out.println();
//can also just print value/key on their own once an iterator has been created
//This second loop will just print:
/*
Eoin
Jess
Emma
Kevin
*/

for(Map.Entry i:myMap.entrySet()) {
    System.out.println(i.getValue());
}

//if want to remove a value and key from a hashMap 
//has an in built method called remove

myMap.remove(3);//will delete the object with the key of 3, so Emma will be 
//deleted

System.out.println(myMap.size());//will now print 3 because
//only 3 keys left after deletion

   
    }
}


//kattis bing question answered with hashMap
/*
import java.util.*;
public class bing {
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
*/

