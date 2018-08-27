package solved;

public class MinimumDistanceToClosestPerson {

	public int maxDistToClosest(int[] seats) {

		int initializer = seats[0];
		int seatCounter = 0;
		int counter = 0;
		int seat = 0; 
		for(int i = 0;i<seats.length;i++){

			if(seats[i] == 1){

				seatCounter = (i-seat);
				if(seat == 0 && initializer == 0 && seatCounter > counter){
					seat = i;
					counter = seatCounter;

				}
				else{
					seat = i;
					if(seatCounter/2 > counter){
						counter = seatCounter/2;

					}
				}
			}

			else if( i == seats.length-1 && seats[i] == 0 ){
				seatCounter = i-seat;
				seat = i;

				if(seatCounter > counter){
					counter = seatCounter;

				}
			}



		}


		return counter;

	}

}
