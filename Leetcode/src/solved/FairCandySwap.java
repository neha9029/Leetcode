package solved;

import java.util.HashSet;

public class FairCandySwap {
	public int[] fairCandySwap(int[] A, int[] B) {

		HashSet<Integer> set = new HashSet<>();



		int sumA = 0;
		int sumB = 0;
		for(int i : A){
			sumA+=i;
		}

		for(int i: B){
			set.add(i);
			sumB+=i;
		}


		int middle = (sumA+sumB) / 2;

		int returnA = 0;
		int returnB = 0;
		int removeInt = 0;

		for(int i = 0; i<A.length;i++){
			returnA = sumA - A[i];
			removeInt = middle - returnA;
			if(set.contains(removeInt)){
				returnA = A[i];
				returnB = removeInt;
				break;                
			}

		}



		return new int[]{returnA,returnB};
	}
}
