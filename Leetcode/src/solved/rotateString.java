package solved;

public class rotateString {

	public boolean rotateString(String A, String B) {
		String C = A;
		if(A.length() != B.length()){
			return false;
		}
		if(A.length() == 0 && B.length() == 0){
			return true;
		}
		char bArr[] = B.toCharArray();
		int index = A.indexOf(bArr[0]);

		while(C.length() != 0){ 
			if(C.indexOf(bArr[0]) == -1){
				return false;
			}
			if(C.indexOf(bArr[0]) != -1){

				int cIndex = C.indexOf(bArr[0]);
				if(index != cIndex){
					index = index + cIndex+1;
				}

				String leftHalf = A.substring(index);
				String rightHalf = A.substring(0,index);

				if(B.equals(leftHalf+rightHalf)){
					return true;
				}
				else{
					C = C.substring(cIndex+1);

				}
			}
		}

		return false;

	}

}
