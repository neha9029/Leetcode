package binarySearch;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        int min = 0;
        if( nums.length < 2){
            min = nums[0];
            return min;
        }
       
        while(left < right){
            int mid = left + (right-left) / 2;
            min = nums[mid];
         
            if(nums[left] < nums[mid] && nums[left]< nums[right]){
                      return nums[left];
            }
            if(nums[mid] <= nums[left] && nums[mid] <=nums[right] && mid - left <2){                  
                      return min;
               
            }
            
            if(nums[mid] > nums[left]){
                left = mid;

            }
            else
            {  
                   right = right-1;
                   if(nums[left] == nums[right] && nums[left] == nums[mid]){
                        return nums[mid+1];
                   }
                
            }
       
          
        }
        
        return 0;
    }

}
