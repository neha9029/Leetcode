package solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        
        String total = A+" "+B;
       HashMap<String, Integer> map = new HashMap<String,Integer>();
       ArrayList<String> list = new ArrayList<String>();
       String words[] = total.split(" ");
       for(int i = 0;i<words.length;i++){
           if(!map.containsKey(words[i])){
               map.put(words[i], 1);
           }
           else{
               int count = map.get(words[i]);
               count++;
               map.put(words[i], count);
           }
       }

       for(Map.Entry<String, Integer> entry:map.entrySet()){
           if(entry.getValue() == 1){
               list.add(entry.getKey());

           }
       }
       
       Object array[] = list.toArray();

       String str[] = new String[array.length];
       for(int i = 0; i<array.length;i++){
           str[i] = (String) array[i];
       }
       
       
       return str;
   }
}
