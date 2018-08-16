package solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
	
    public String mostCommonWord(String paragraph, String[] banned) {
        
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(banned));

        paragraph = paragraph.replaceAll("[,'?!.;:]","").toLowerCase();
        String words[] = paragraph.split(" ");
        int max = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
     
        for(int i = 0; i<words.length;i++){
            if(!list.contains(words[i])){
                 final int k = i;

            if(!map.containsKey(words[i])){
                
                map.put(words[i], 1);
                
                
            }
            else{
                int count = map.get(words[i]);
                count++;
                map.put(words[i], count);

                }
                  max = map.get(words[k]);
             }
        
        }
         

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();

            }
        }
    
        
        for(String key: map.keySet()) {
            if(map.get(key).equals(max)) {
                return key; 
           }
       }
        
        
        
      
        
        return "";
    }

}
