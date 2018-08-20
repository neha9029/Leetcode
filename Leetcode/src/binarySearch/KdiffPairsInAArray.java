package binarySearch;

import java.util.HashSet;

public class KdiffPairsInAArray {
    public int findPairs(int[] nums, int k) {

    if(k < 0){
        return 0;
    }
    int left = 0;
    HashSet<String> set = new HashSet<>();
    int right = nums.length-1;
      int minusAbs = 0;
      while(left < right){
     minusAbs = Math.abs(nums[left] - nums[right]);

        if(minusAbs == k){
            if(!set.contains (""+nums[left]+nums[right]) && !set.contains(""+nums[right]+nums[left])){
                    set.add(""+nums[left] +nums[right]);
               
            } 
            
        }
        
        if(right - left == 1){
            right = nums.length-1;
            left = left+1;

          }
        else{
        right = right-1;
            
        }

     
      
    }
    
return set.size();
    }
}
