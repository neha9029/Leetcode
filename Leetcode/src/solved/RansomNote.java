package solved;

import java.util.HashMap;

public class RansomNote {
	
    public boolean canConstruct(String ransomNote, String magazine) {

    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    
    
    for(int i = 0; i<magazine.length();i++){
        char z = magazine.charAt(i);
        if(!map.containsKey(z)){
            map.put(z,1);
        }
        else{
            int count = map.get(z);
            count++;
            map.put(z,count);
        }
    }
    
    
    for(int i = 0; i<ransomNote.length();i++){
        char f = ransomNote.charAt(i);
        if(map.containsKey(f)){
            
            int value = map.get(f);
            if( value >= 1){
                value--;
                map.put(f,value);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    return true;
}

}
