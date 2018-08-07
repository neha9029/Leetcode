package solved;

import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {
	
	 public boolean buddyStrings(String A, String B) {
	        
	        if((A.length() != B.length()) || (A.length() < 1 || B.length() < 1))
	        {
	            return false;
	        }
	        int j = 0;
	        int count = 0;
	        StringBuilder sb = new StringBuilder(A);
	        int diff = 0;

	        char []arrayA = A.toCharArray();
	        char []arrayB = B.toCharArray();
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        
	        if(A.equals(B)){
	            for(int i = 0; i< arrayA.length;i++){
	                if(!map.containsKey(arrayA[i])){
	                    map.put(arrayA[i], 1);
	                }
	                else{
	                    int index = map.get(arrayA[i]);
	                    index++;
	                    map.put(arrayA[i], index);
	                }
	            }
	            
	            for(Map.Entry<Character,Integer> entry: map.entrySet()){
	                if(entry.getValue() >= 2){
	                    return true;
	                }
	            }
	        }
	        else{
	            
	        
	        for(int i = 0; i<arrayB.length;i++){
	             if(arrayB[i] != arrayA[0]){
	                diff++;
	             }
	            if(A.indexOf(arrayB[i]) == -1){
	                return false;
	            }
	        }

	        if(diff == 0){
	            return true;
	        }
	        
	     
	        for(int i = 0; i<arrayA.length;i++){
	            
	            if(j < arrayB.length){
	                if(arrayA[i] != arrayB[j]){
	                      sb.setCharAt(i,arrayB[j]);

	                    count++;
	                    
	                }
	                
	                j++;
	            }
	        }
	        }
	        if(count == 2 && sb.toString().equals(B)){
	            return true;
	        }
	        else{
	           return false;

	        }
	    }

}
