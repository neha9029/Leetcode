package queueAndStack;

import java.util.Stack;

public class BackspaceStringCompare {

	public boolean backspaceCompare(String S, String T) {
		Stack<Character> stackS = new Stack<Character>();
		Stack<Character> stackT = new Stack<Character>();

		char sArray[] = S.toCharArray();
		char tArray[] = T.toCharArray();

		for(char s : sArray){
			if(s == '#'){
				if(!stackS.isEmpty())
					stackS.pop();
			}
			else{
				stackS.push(s);
			}
		}

		for(char t : tArray){
			if(t == '#'){
				if(!stackT.isEmpty())

					stackT.pop();
			}
			else{
				stackT.push(t);
			}
		}


		if(stackS.equals(stackT)){
			return true;
		}

		return false;
	}

}
