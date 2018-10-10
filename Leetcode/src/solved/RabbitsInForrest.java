package solved;

public class RabbitsInForrest {
	
	 public int numRabbits(int[] answers) {
	        int rabitSubset[] = new int[answers.length];

	        int totalRabbits = 0;
	        for(int i = 0; i<answers.length;i++){
	            int otherRabits = answers[i];
	            if(answers[i] != 0){

	                if(rabitSubset[otherRabits] == 0){
	                   totalRabbits+=(answers[i]+1);

	                }
	                  rabitSubset[otherRabits]++;
	                if(rabitSubset[otherRabits] > answers[i]+1){
	                    totalRabbits += answers[i]+1;

	                    rabitSubset[otherRabits] = 1;
	                }
	            
	            }
	            else{
	                totalRabbits++;

	            }
	            
	            
	        }
	        
	        
	        return totalRabbits;
	        
	    }

}
