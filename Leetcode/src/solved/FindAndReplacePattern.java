package solved;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class FindAndReplacePattern {
	
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> solution = new ArrayList<String>();
        
        String encodePatern = encode(pattern);
        String hashMapValList = hashMapValList(pattern);
        for(int i = 0; i<words.length; i++){
            
            if((encode(words[i]).equals(encodePatern)) && hashMapValList(words[i]).equals(hashMapValList)){
                
                solution.add(words[i]);
            }
        }
        
        return solution;
    }
                  
    
  
    public String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i + 1 < source.length()
                && source.charAt(i) == source.charAt(i + 1)) {
                runLength++;
            i++;
        }
        dest.append(runLength);
        }
        return dest.toString();
    }
                      
       public String hashMapValList(String source){
           
           LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
           
           char str[] = source.toCharArray();
           for(int i = 0; i<str.length;i++){
               if(!hashMap.containsKey(str[i])){
                   hashMap.put(str[i], 1);
               }
               else{
                   int count = hashMap.get(str[i]);
                   count++;
                   hashMap.put(str[i], count);
               }
           }
           
           StringBuilder  strb = new StringBuilder();
           
           for(int i = 0;i<str.length;i++){
               strb.append(hashMap.get(str[i])).append(" ");
           }
           
           return strb.toString();        
           
       }               

}
