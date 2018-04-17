package solved;

public class RepeatedStringMatch {
	 public int repeatedStringMatch(String A, String B) {
		    
	        String str = A;
	        int count = 1;
	        String b = B.replace("\"","");

	        if(A.contains(b)){
	            return 1;
	        }
	        while(str.indexOf(b) < 0){
	            A = A.concat(str);
	            count++;
	                // System.out.println(count);
	                //  System.out.println(A.length());
	                // System.out.println(b.length());
	            
	            if(A.contains(b)){
	                return count;
	            }
	            else if(A.length() > 10000){
	                return -1;
	            }
	            else if(b.length() < A.length()){
	                if(count > 10){
	                   return -1;
	              }
	            }
	              
	        }
	        
	        return -1;
	 }
}
