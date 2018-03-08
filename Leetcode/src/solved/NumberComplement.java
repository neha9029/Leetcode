package solved;

public class NumberComplement {
    public int findComplement(int num) {
        
        
        String str = Integer.toString(num, 2);
        char arr[] = str.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '0'){
                arr[i] = '1';
            }
            else if(arr[i] == '1'){
                arr[i] = '0';
            }
        }
        
        String com = String.valueOf(arr);
        
        int complement = Integer.parseInt(com,2);
        
        return complement;
    }
}
