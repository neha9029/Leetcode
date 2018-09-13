package solved;

public class JumpGame {

	public boolean canJump(int[] nums) {

		int len = nums.length -1;
		int max = nums[0];
		int jumpElement = 0;


		if(nums.length < 1){
			return false;

		}
		if(nums.length == 1){
			return true;
		}


		for(int i = 0; i<nums.length-1;i++){

			if(nums[i] == 0){
				if(i >= max){
					break;
				}
			}
			if(nums[i] != 0){
				jumpElement = nums[i]+i;
				if(jumpElement >= len){

					return true;
				}
				if(jumpElement >= max){
					max = jumpElement;
				}

			}
		}

		return false;

	}

}
