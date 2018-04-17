package solved;

public class RotateArray {

	public void rotate(int[] nums, int k) {

		k = k % nums.length; 
		int array[] = new int[nums.length];
		int change = nums.length - k;
		int element = 0;
		for(int i = 0;i<nums.length; i++){
			if(i < k){
				array[i] = nums[change];
				change++;
			}
			else if(i >=k){
				array[i] = nums[element];
				element++;
			}
		}

		for(int i = 0; i< nums.length; i++){
			nums[i] = array[i];
		}

	}
}
