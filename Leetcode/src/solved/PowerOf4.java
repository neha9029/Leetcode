package solved;

public class PowerOf4 {
    public boolean isPowerOfFour(int num) {
        

        if(num < 1){
            return false;
        }
        
        while(num % 4 == 0){
           
            num /= 4;
        }
        
        return num == 1;
}
}
