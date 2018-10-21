package queueAndStack;

import java.util.Stack;

public class DailyTemperature {

	public int[] dailyTemperatures(int[] T) {

		Stack<Integer> stack = new Stack<>();
		int[] array = new int[T.length];
		for(int i = T.length-1;i>=0;i--){
			while(!stack.isEmpty() && T[stack.peek()] <= T[i]){
				stack.pop();
			}
			if(stack.isEmpty()){
				array[i] = 0;
			}
			else{
				array[i] = stack.peek() - i;
			}
			stack.push(i);

		}

		return array;

	}

}
