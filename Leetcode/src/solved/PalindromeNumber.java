package solved;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {

		if(x < 0){
			return false;
		}
		long xNo = x;
		long rev = 0;
		while(xNo != 0){
			rev = rev * 10 + xNo % 10;
			xNo /= 10;
		}
		System.out.println(rev);
		System.out.println(x);

		if(rev > Long.MAX_VALUE || rev < Long.MIN_VALUE){
			return false;
		}


		else {
			if(rev == x){
				System.out.println(rev);
				System.out.println(x);

				return true;
			}
			else{
				return false;
			}
		}


	}
}
