package solved;

public class ContainsDuplicateII {
	   public boolean containsNearbyDuplicate(int[] nums, int k) {
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i< nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i], i);
	            }
	            else{ int lastposition = map.get(nums[i]);
	                 if(i - lastposition <= k){
	                     return true;
	                 }else{
	                     map.put(nums[i], i);
	                 }
	                
	            }
	        }
	        
	        return false;
	    }
}
