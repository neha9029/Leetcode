package solved;

public class isMonotonic {
	public boolean isMonotonic(int[] A) {

		int monoton = A[0];
		int lastElement = A[A.length-1];
		if(lastElement <= monoton){
			for(int i = 1; i<A.length;i++){
				if(A[i] <= monoton){
					monoton = A[i];
				}
				else{
					return false;
				}

			}
		}
		else{
			for(int i = 1; i<A.length;i++){
				if(A[i] >= monoton){
					monoton = A[i];
				}
				else{
					return false;
				}

			}

		}

		return true;

	}

}
