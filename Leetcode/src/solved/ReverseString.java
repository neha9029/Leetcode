package solved;

public class ReverseString {
    public String reverseString(String s) {
        
        char str[] = s.toCharArray();
        char rev[] = new char[str.length];
        int j=0;
        for(int i = str.length-1; i>=0;i--){
            rev[j] = str[i];
            j++;
        }
        
        return String.valueOf(rev);
        
    }
}
