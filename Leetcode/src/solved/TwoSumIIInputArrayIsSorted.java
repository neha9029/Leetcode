package solved;

public class TwoSumIIInputArrayIsSorted {

	public int[] twoSum(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length-1;
		int sum = 0;
		while(left < right){
			sum = numbers[left]+ numbers[right];
			if(sum == target){
				return new int[] {left+1, right+1};
			}
			else{

				if(right == left + 1){
					right = numbers.length-1;
					left = left+1;
				}
				else{
					right = right-1;

				}
			}

		}

		return new int[]{0, 0};

	}

}
