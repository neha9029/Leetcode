package queueAndStack;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {


		Stack<Integer> stack = new Stack<Integer>();
		int peek = 0;
		int pop = 0;
		int element = 0;
		for(int i = 0; i<ops.length;i++){

			if(ops[i].equals("C")){
				stack.pop();
				continue;
			}
			else if(ops[i].equals("D")){
				peek = stack.peek();

				stack.push(peek*2);
				continue;

			}
			else if(ops[i].equals("+")){
				pop = stack.pop();
				peek= stack.peek();

				stack.push(pop);
				int combine = pop + peek;
				stack.push(combine);
				continue;
			}
			else{
				element = Integer.parseInt(ops[i]);

				stack.push(element);
				continue;

			}

		}

		int sum = stack.stream().mapToInt(i -> i.intValue()).sum();

		return sum;


	}
}