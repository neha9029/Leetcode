package solved;

import java.util.HashMap;

public class LemonadeChange {

	public boolean lemonadeChange(int[] bills) {

		HashMap<Integer,Integer> money = new HashMap<Integer,Integer>();
		if(bills[0] != 5){
			return false;
		}
		else{

			for(int i = 0; i<bills.length; i++){
				if(bills[i] == 5){
					if(!money.containsKey(5)){
						money.put(5,1);

					}
					else{
						int count = money.get(5);
						count++;
						money.put(5, count);
					}

				}
				if(bills[i] == 10){
					if(!money.containsKey(5)){
						return false;
					}
					else{
						int count = money.get(5);
						count--;
						if(count == 0){
							money.remove((Integer) 5);
						}
						else{
							money.put(5, count);
						}
					}
					if(!money.containsKey(10)){
						money.put(10,1);
					}
					else{
						int count= money.get(10);
						count++;
						money.put(10, count);
					}
				}
				if(bills[i] == 20){     
					if((!money.containsKey(5)) || (!money.containsKey(10) && (money.get(5) < 3 ))){
						return false;
					}
					else if((!money.containsKey(10) && (money.get(5) < 3 ))){
						return false;
					}
					else {

						if(money.get(5) != null && money.get(10) != null){                           
							int count5 = money.get(5);
							int count10 = money.get(10);
							count5--;
							count10--;
							if(count5 ==0){
								money.remove((Integer)5);
							}
							else{
								money.put(5, count5);

							}
							if(count10 == 0){
								money.remove((Integer) 10);
							}
							else{
								money.put(10, count10);

							}
						}
						else if(money.get(5) != null  && money.get(5) >= 3){
							int count5 = money.get(5);
							count5-=3;
							if(count5 == 0){
								money.remove((Integer) 5);
							}
							else{
								money.put(5, count5);

							}                        
						}                    


					}



				}

			}

		}
		return true;







	}


}
