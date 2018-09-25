package recursion;

public class Pow {
	   public double myPow(double x, int n) {
	        
	        double returnPow = 0;
	        if(n == 0){
	            return 1;
	        }
	         if(x > 1 && (n > Integer.MAX_VALUE || n <= Integer.MIN_VALUE)){
	                return 0.0;
	            }
	        else{
	          int p = 0;
	            if(n < 0){
	                p = -n;
	            }
	            else{
	                p = n;
	            }
	           
	            double half = myPow(x, p/2);
	            
	            if(p % 2 == 0){
	                double evenProduct = half * half;                
	                returnPow= evenProduct;
	            }
	            else{
	                double oddProduct = x * half * half;
	                 returnPow = oddProduct;
	                     
	            }
	            
	            if(n < 0){
	                return (1/returnPow);
	            }
	            else{
	                return returnPow;
	            }
	        }
	    }
}
