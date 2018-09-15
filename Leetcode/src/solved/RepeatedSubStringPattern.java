package solved;

public class RepeatedSubStringPattern {

	
    public boolean repeatedSubstringPattern(String s) {
        
        
        char array[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        //len
        int i = s.length();
        if(i < 2){
            return false;
        }
        
        //len less than 3 and all characters matching;
        if(i < 3 && isCheck(array[0], array)){
                return true;
        }
        
        // to check if len is prime and all characters are same
        if(i >= 3 && isPrime(i)){
           if(isCheck(array[0], array)){
               return true;
           }
           else{
               return false;
           }
        }
        
        //odd len but not prime   
        for(int j = 3; j*2<= i;j=j+2){
            if(i % j == 0){
               int k = i / j;
                if(s.substring(0,i).equals(s.substring(i-j,s.length()))){
                    return true;
                }
                else if(s.substring(0,k).equals(s.substring(i-k,s.length()))){

                    return true;
                }
            }
        }
        
        //even len
        while(i > 1){
               i = i/2;
            sb.setLength(0);
            sb.append(s.substring(0,i));
            if(sb.toString().equals(s.substring(i))){
                return true;
            }           
        }
        
        return false;
      
    }
    
    
    public boolean isPrime(int i){
          for(int j = 2; j*j <= i;j++) {
			    if(i % j == 0) {
				return false;
		    }
                
	}
        
        return true;
    }
    
    public boolean isCheck(char first, char array[]){

         for(int k = 0; k< array.length;k++){
                if(array[k] != first){
                    return false;
                }
            
            }
        
        return true;
}
}
