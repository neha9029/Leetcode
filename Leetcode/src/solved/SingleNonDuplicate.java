package solved;

import java.util.HashMap;
import java.util.Map;

public class SingleNonDuplicate {
	
    public int singleNonDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
           for(int i = 0; i<nums.length;i++){
               if(!map.containsKey(nums[i])){
                   map.put(nums[i], 1);
               }
               else{
                   int count = map.get(nums[i]);
                   count++;
                   map.put(nums[i], count);
               }
           }
           
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               if((int) entry.getValue() == 1){
                   return entry.getKey();
               }
           }
           
           return 0;
       }

}
