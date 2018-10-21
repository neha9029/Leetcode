package queueAndStack;

import java.util.HashMap;
import java.util.Stack;

public class MinimumAddToMakeParanthesisValid {

	public int minAddToMakeValid(String S) {

		HashMap<Character, Character> map = new HashMap<Character,Character>();
		Stack<Character> stack = new Stack<Character>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');

		int count = 0;
		for(int i = 0 ; i<S.length();i++){
			char brace =  S.charAt(i);
			if(map.containsKey(brace)){
				stack.push(brace);
			}
			else{
				if(!stack.isEmpty()){
					char t = stack.peek();
					if(map.get(t) == brace){
						stack.pop();
					}

				}
				else{
					count++;
				}
			}



		}

		if(!stack.isEmpty()){
			count = count + stack.size();
		}
		return count;

	}
}
