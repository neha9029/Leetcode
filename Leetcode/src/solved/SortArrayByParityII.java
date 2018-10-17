package solved;

public class SortArrayByParityII {
	
	   public int[] sortArrayByParityII(int[] A) {
	       
	        
	        int array[] = new int [A.length];
	        int x = 0;
	        int y = 1;
	        for(int i = 0; i< A.length;i++){
	            if(A[i] % 2 == 0){
	                array[x] = A[i];
	                x = x+2;
	            }
	            else{
	                array[y] = A[i];
	                y = y+2;
	            }
	        }
	        

	        
	        return array;
	    }

}
