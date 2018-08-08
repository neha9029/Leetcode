package solved;

public class FirstUniqueCharacter {
	
    public int firstUniqChar(String s) {   
        char[] str = s.toCharArray();  
        for(int i = 0; i<s.length(); i++){
            if(s.indexOf(str[i]) == s.lastIndexOf(str[i])){
                return i;
            }
        }
            
        return -1;
    }

}
