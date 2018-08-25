package queueAndStack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i<s.length();i++){
            char schar = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(schar);
               continue;
            }
            if(map.containsKey(stack.peek())){
                if(schar == map.get(stack.peek())){
                    stack.pop();
                }
                else{
                    stack.push(schar);
                }
            }
            
        }
        
      
        return stack.isEmpty()? true: false;
        
    }
}
