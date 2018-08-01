package solved;

public class Sqrtx {
	
	   public int mySqrt(int y) {

	        long x = y;

	        for(long i = 1; i<= x / 2+1; i++){
	            
	            if( i * i == x){
	                return (int) i;
	            }
	           
	            if(i * i > x){
	                return (int) i - 1;
	            }
	        }
	        
	        return 0;
	   }

}
