package solved;

import java.util.HashMap;

public class FindAnagramMappings {

    public int[] anagramMappings(int[] A, int[] B) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<B.length;i++){
            if(!map.containsKey(B[i])){
                map.put(B[i], i);
            }
        }
        
        int anagrams[] = new int[A.length];
        for(int i = 0; i<A.length;i++){
            anagrams[i] = map.get(A[i]);
        }
        
        return anagrams;
    }
}
