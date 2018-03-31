//Link to Question: https://open.kattis.com/problems/karte
import java.util.*;
public class karte {
    public static int Pnum = 0, Knum = 0, Hnum = 0, Tnum = 0;
    public static int[]pArray = new int[13], hArray = new int[13], kArray = new int[13], tArray = new int[13];
    public static void main (String[] args){
        Scanner userScan = new Scanner(System.in);
        String deck = userScan.next();
        int pCounter = 0, hCounter = 0, kCounter = 0, tCounter = 0;
        int hasbeenBefore = 1;
        boolean stillValid = true;
        for(int i = 0; i < deck.length();i+=3){
            if(stillValid ==true){
            switch(deck.charAt(i)){
                case 'P': Pnum++;
                String number = ""+deck.charAt(i+1) + deck.charAt(i+2);
                int num = Integer.parseInt(number);
                pArray[pCounter] = num;
                if(i >0){
                    for(int j = 0;j<pCounter;j++){
                        if(pArray[j] == num){
                            hasbeenBefore++;
                        }
                        
                    }
                    if(hasbeenBefore > 1){
                        stillValid = false;
                    } else {
                        hasbeenBefore = 1;
                    }
                }
                pCounter++;
                break;
                case 'K': Knum++;
                number = ""+deck.charAt(i+1) + deck.charAt(i+2);
                num = Integer.parseInt(number);
                kArray[kCounter] = num;
                if(i >0){
                    for(int j = 0;j<kCounter;j++){
                        if(kArray[j] == num){
                            hasbeenBefore++;
                        }
                        
                    }
                    if(hasbeenBefore > 1){
                        stillValid = false;
                    } else {
                        hasbeenBefore = 1;
                    }
                }
                kCounter++;
                break;
                case 'H': Hnum++;
                number = ""+deck.charAt(i+1) + deck.charAt(i+2);
                num = Integer.parseInt(number);
                hArray[hCounter] = num;
                if(i >0){
                    for(int j = 0;j<hCounter;j++){
                        if(hArray[j] == num){
                            hasbeenBefore++;
                        }
                        
                    }
                    if(hasbeenBefore > 1){
                        stillValid = false;
                    } else {
                        hasbeenBefore = 1;
                    }
                }
                hCounter++;
                break;
                case 'T': Tnum++;
                number = ""+deck.charAt(i+1) + deck.charAt(i+2);
                num = Integer.parseInt(number);
                tArray[tCounter] = num;
                if(i >0){
                    for(int j = 0;j<tCounter;j++){
                        if(tArray[j] == num){
                            hasbeenBefore++;
                        }
                    }
                    if(hasbeenBefore > 1){
                        stillValid = false;
                    } else {
                        hasbeenBefore = 1;
                    }
                }
                tCounter++;
                break;
            }
        }
    }       
    if(stillValid ==true){
        System.out.println((13 - Pnum) + " " + (13 - Knum) + " " + (13 - Hnum) + " " + (13 - Tnum));
    } 
     else {
        System.out.println("GRESKA");
    }
    userScan.close();
    }  
}

