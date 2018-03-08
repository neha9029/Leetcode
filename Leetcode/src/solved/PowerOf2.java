package solved;

public class PowerOf2 {
	public boolean isPowerOfTwo(int n) {
		long m = n;
		if(m == 1){
			return true;
		}
		int power = 2;
		long product = 1;
		while(power <= m){
			product = product * power;
			System.out.println("product" +product);
			System.out.println("power" +power);

			if(product >= m){
				break;
			}
		}


		if(product == m){
			return true;
		}
		else{
			return false;
		}
	}
}
