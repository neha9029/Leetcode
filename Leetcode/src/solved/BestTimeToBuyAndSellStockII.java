package solved;

public class BestTimeToBuyAndSellStockII {

	
	   public int maxProfit(int[] prices) {
		      
	        int totalProfit = 0;
	        for(int i = 1;i<prices.length;i++){
	            int sellingProfit =prices[i] - prices[i-1]; 
	            if( sellingProfit >= 1){
	                totalProfit += sellingProfit;
	            }
	        }
	        
	        return totalProfit;
	    }
}
