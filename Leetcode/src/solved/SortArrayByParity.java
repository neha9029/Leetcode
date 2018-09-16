package solved;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        
        int B[] = new int[A.length];
        int pos = 0;
        int reversePos = A.length-1;
        for(int element : A){
            if(pos< A.length && reversePos >=0){
            if(element % 2 == 0){
                B[pos] = element;
                pos++;

            }
            else{
                B[reversePos] = element;
                reversePos--;
             }
            }
        }
        
        return B;
    }
}
