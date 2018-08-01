package solved;

public class PeakIndexInAMountainArray {
	
	  public int peakIndexInMountainArray(int[] A) {
	       
	        int max = A[0];
	        int maxElement = 0;
	        for(int i = 0; i<A.length;i++){
	            if(A[i] > max){
	                max = A[i];
	                maxElement = i;
	            }
	        }
	        
	        
	        
	        return maxElement;
	  }
}
