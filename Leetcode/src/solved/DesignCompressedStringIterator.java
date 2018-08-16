package solved;

public class DesignCompressedStringIterator {
    StringBuilder given;
    char f;
    int t;
    int index = 0;

    public void StringIterator(String compressedString) {
        given = new StringBuilder(compressedString);
    }
    
    public char next() {
        if(hasNext() != false){
            
            f = given.charAt(0);
            StringBuilder findDigit = new StringBuilder();

           out : for(int i = 1; i<given.length();i++){
                if(Character.isDigit(given.charAt(i))){
                    findDigit.append(given.charAt(i));
                    index = i;
                }
                else{
                    break out;
                }

            }
            

            t = Integer.parseInt(findDigit.toString()); 

             if(t>1){
           
                 t=t-1;
                 String newStr = Integer.toString(t);
                 findDigit.setLength(0);
                 findDigit.append(newStr);
                 
                 given = given.replace(1,index+1,findDigit.toString());
                 return f;
     
            }
            
            else if(t == 1){
            given = given.deleteCharAt(0);
            given = given.deleteCharAt(0);
                return f;

            }
           
        }
         return ' ';
    }
    
    public boolean hasNext() {
        if(given.length() > 0) {
            return true;
        }
        
        return false;
    }
}
