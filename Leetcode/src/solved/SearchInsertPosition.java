package solved;

public class SearchInsertPosition {
	
	    public int searchInsert(int[] nums, int target) {
	        
	        int pos = 0;
	         if(target <= nums[0]){
	             pos = 0;
	         }
	        for(int i = 1; i<nums.length;i++){
	           if(target == nums[i-1]){
	                pos = i-1;
	            }
	            else if(target >nums[i-1] && target<=nums[i]){
	                pos = i;
	            }
	            
	        }
	        
	        if(target > nums[nums.length-1]){
	            pos = nums.length;
	        }
	        return pos;
	    }


}
