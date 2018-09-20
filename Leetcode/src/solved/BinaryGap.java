package solved;

public class BinaryGap {
    public int binaryGap(int N) {
        
        
        String binary = Integer.toBinaryString(N);
        char arr[] = binary.toCharArray();
        
        
        int left = 0;
        int right = left+1;
        int max = 0;

        int len = binary.length();
        if(len == 1){
            return 0;
        }
        while(left< right){
   

                if(arr[left] == '1' && arr[right] != '1'){
                    if(right < len-1)
                    right++;
                    else{
                        return max;
                    }
                 }
                else if(arr[left] != '1'){
                    left++;
                 }
                else if(arr[left] == '1' && arr[right] == '1'){
                    int distance = right - left;
                        if(distance > max){
                             max = distance;
                
                        }
                        if(right < binary.length()-1){
                        left=right;
                        right++;
                        }
                        else{
                            return max;
                        }
                                         

            
        
                
            }
         

           
            
        }
        return max;
        
        
    }
}
