package solved;

public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {

		int sum = 1;

		if (num == 1)
			return false;
		for(int i = 2; i<= Math.sqrt(num); i++){
			if(num % i == 0 ){
				sum+=i;
				System.out.println(i);
				if(i !=num/i)
					sum +=num /i;
			}


		}


		if(sum == num){
			return true;
		}
		else{
			return false;
		}
	}
}
