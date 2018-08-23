package binarySearch;

import java.util.Arrays;

public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {

		Arrays.sort(nums);
		if(nums.length == 0){
			return false;
		}

		int left = 0;
		int right = nums.length-1;
		while(left<=right){
			int mid = left + (right -left)/2;
			if(nums[mid] == target){
				return true;
			}
			if(nums[mid] > target){

				right = mid-1;
			}
			else{                               

				left = mid+1;
			}

		}

		return false;

	}

}
