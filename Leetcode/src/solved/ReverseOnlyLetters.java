package solved;

public class ReverseOnlyLetters {

	 public String reverseOnlyLetters(String S) {
	        
	        StringBuilder sb = new StringBuilder();
	         for(int i = 0; i<S.length();i++){
	             
	             char letter = S.charAt(i);
	             if(Character.isLetter(letter)){
	                 sb.append(letter);
	             }
	         }
	        sb.reverse();
	        
	        StringBuilder newString = new StringBuilder();
	        int j = 0;
	        for(int i = 0; i<S.length();i++){
	            char letter = S.charAt(i);
	            if(Character.isLetter(letter)){
	                newString.append(sb.charAt(j));
	                    j++;
	                
	            }
	            else{
	                newString.append(letter);
	            }
	        }
	        
	        return newString.toString();
	    }
}
