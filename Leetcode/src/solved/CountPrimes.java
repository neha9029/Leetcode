package solved;

public class CountPrimes {

    public int countPrimes(int n) {

        
        boolean[] primes = new boolean[n];
       
       int primeNos = 0;
        for(int i = 2; i<n;i++){
            if(primes[i] == false){
                primeNos++;
            }
            for(int j = 2; i*j<n;j++){
                primes[i*j] =true;
            }
        }
       
    
       
       return primeNos;
       
       
       

   } 
	
    /* 
    int count= 0;
    for(int i  = 2; i<n;i++){
        if(getPrime(i)){
            count++;
        }
    }
    
    return count;

}

public boolean getPrime(int n){
    for(int i = 2; i*i<=n;i++){
        if(n % i == 0){
            return false;
        }
    }
    
    return true;
}
*/
}
