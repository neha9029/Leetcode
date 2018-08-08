package solved;

public class TwoSumI {
	
	 public int[] twoSum(int[] nums, int target) {
	        
	        int left = 0;
	        int right = nums.length-1;
	        int sum = 0;
	        while(left < right){
	             sum = nums[left]+ nums[right];
	             if(sum == target){
	                  return new int[] {left, right};
	             }
	             else{
	                 
	                 if(right == left + 1){
	                     right = nums.length-1;
	                     left = left+1;
	                 }
	                 else{
	                 right = right-1;
	                     
	                 }
	             }
	            
	        }

	        return new int[] {0,0};
	 }
}
