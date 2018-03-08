package solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        String ranks[] = new String[nums.length];
        int count = 0;
        for(int i=0; i<nums.length;i++){
                map.put(nums[i],count);
                count++;    
        }
        
        Integer copy[] = new Integer[nums.length];
        for(int i = 0; i<nums.length;i++){
            copy[i] = new Integer (nums[i]);
        }
        
        Arrays.sort(copy, Collections.reverseOrder());
 
        for(int i = 0; i<copy.length; i++){
            
            int index = map.get(copy[i]);
            if(i == 0){
                
                ranks[index] ="Gold Medal";
            }
              else if(i == 1){
                
                ranks[index] ="Silver Medal";
            }
              else if(i == 2){
                
                ranks[index] ="Bronze Medal";
            }
            else{
                
                ranks[index] = Integer.toString(i+1);
            }
        }
        
        return ranks;
    }
}
