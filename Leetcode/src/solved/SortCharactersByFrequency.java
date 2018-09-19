package solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortCharactersByFrequency {

	 public String frequencySort(String s) {
		 
	        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	        
	        final int ascii = 128;
	        for(int i = 0; i<s.length();i++){
	                if(!map.containsKey(s.charAt(i))){
	                    map.put(s.charAt(i), 1);
	                }
	                else{
	                    int count = map.get(s.charAt(i));
	                    count++;
	                    map.put(s.charAt(i), count);
	                }
	            }
	    
	        Integer []sequence = map.values().toArray(new Integer[map.size()]);

	        Arrays.sort(sequence, Collections.reverseOrder());

	            StringBuilder sb = new StringBuilder();
	           for(int k = 0; k<sequence.length;k++){
	               for(int j = 0;j<ascii;j++){
	                if(map.containsKey((char) j)){
	                     char t = (char) j ;
	                 if(map.get(t) == sequence[k] && sb.indexOf(t+"") == -1 ){
	                     for(int m = 0; m<sequence[k];m++){
	                                sb.append(t);

	                     }

	             }
	           }
	         }
	        }
	    
	        
	        return sb.toString();
	 }
}
