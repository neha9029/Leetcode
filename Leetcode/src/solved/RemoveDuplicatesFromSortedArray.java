package solved;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        for(int j=1; j< nums.length; j++){
            if(i < nums.length-1){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }
            }
        }
        return i+1;
    }
}
