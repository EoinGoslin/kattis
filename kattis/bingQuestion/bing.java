import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class bing {
    public static void main (String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
    String s;
    String[] st;
    Map<String, Integer> myMap = new HashMap<String, Integer>(); 
    for(int i = 0; i < number; i++){
        s = br.readLine();
        st = s.split("");//remove any spaces
        //check to see if the map contains the key s
        //if it does, retreive the key and add "", otherwise s is equal to 0
        s = myMap.containsKey(s)? myMap.get(s) + "": "0";
        bw.write(s + "\n");
        s = "";

        for(int j = 0; j < st.length; j++){
            s = s + st[j];
            if(myMap.containsKey(s)){
                myMap.put(s, myMap.get(s) + 1);
            }
            else {
                myMap.put(s, 1);
            }
   
        }

    }

    bw.flush();
  
    }
}