package solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class XOfAKindInADeckOfCard {

    public boolean hasGroupsSizeX(int[] deck) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<deck.length; i++){
            if(!map.containsKey(deck[i])){
                map.put(deck[i], 1);
            }
            else{
                int count = map.get(deck[i]);
                count++;
                map.put(deck[i], count);
            }
        }
        
        Integer[] list = map.values().toArray(new Integer[map.size()]);
        Arrays.sort(list);

        
        int maxCount = list[0];
        
        HashSet<Integer> set = new HashSet<Integer>();
        int copy = maxCount;
        for(int i = 2; i<=copy; i++){
            if(copy % i == 0){
                set.add(i);
                copy /= i;
                i--;
            }
        }
      

        for(int i = 0; i<list.length; i++){
            if(list[i] < 2){
                return false;
            }
            
            if(checkNumber(list[i], set) == false){
                return false;
            }
          
            
        }
        
        return true;
    }
    
    public boolean checkNumber(int maxCount, HashSet<Integer> set){
   
        for(int i : set){
            if(maxCount % i == 0){
                return true;
            }
            else{
                continue;
            }
        }
        
        return false;
    }
}
