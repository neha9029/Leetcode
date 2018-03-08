package solved;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {

    long m = n;
    long product = 1;
    int power = 3;
    while(product < m){
        product = product * power;
        
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
