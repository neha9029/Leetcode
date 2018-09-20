package solved;

import java.util.HashMap;

public class StobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        char arr[] = num.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        map.put('6','9');
        map.put('1','1');
        map.put('8','8');
        map.put('9','6');
        map.put('0','0');
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                return false;
            }
            else{
                sb.append(map.get(arr[i]));
            }
        }
        sb = sb.reverse();
        if(sb.toString().equals(num)){
            return true;
        }
        else{
            return false;
        } 
    }
}
