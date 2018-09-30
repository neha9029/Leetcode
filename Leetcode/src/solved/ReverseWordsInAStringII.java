package solved;

public class ReverseWordsInAStringII {

    public void reverseWords(char[] str) {
        String s = String.valueOf(str);

        
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            if(i >= 1){
                sb.append(" ");
            }
        }
        
        String t = sb.toString();
        
        for(int i = 0; i<t.length();i++ ){
            str[i] = t.charAt(i);
        }
        
        
    }
}
