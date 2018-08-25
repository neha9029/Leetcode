package solved;

public class ToLowerCase {

	   public String toLowerCase(String str) {
	        	        
	        for(int i = 0; i<str.length();i++){
	            
	           char s = str.charAt(i);
	            if(s > 64 && s <91){
	            char replace = (char)(s+32);            
	            str = str.replace(s, replace);
	            }
	            
	        }
	        
	        return str;
	    }
}
