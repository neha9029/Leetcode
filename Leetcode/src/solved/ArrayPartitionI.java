package solved;

import java.util.Arrays;

public class ArrayPartitionI {
	
    public int arrayPairSum(int[] nums) {
        
        
        Arrays.sort(nums);
        
        int sum = 0;
        for(int x = 0; x<nums.length-1;x=x+2){
            sum+=getMin(nums[x], nums[x+1]);
        }
        
        return sum;
        
    }
    
    public int getMin(int x, int y){
       return x<y? x: y;
    }

}
