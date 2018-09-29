package solved;

public class ReverseWordsInAString {


public static String reverseWords(String s) {
	s = s.trim();
    String str[] = s.split(" ");
    
    StringBuilder sb = new StringBuilder();
    for(int i = str.length-1; i>= 0; i--){
        if(str[i].length() > 0) {
        sb.append(str[i]);
        
        if(i >= 1) {
        	   sb.append(" ");
        }
        }
    }
    
    
    return sb.toString();
}
}
