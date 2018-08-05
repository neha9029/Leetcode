package solved;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int x: nums1){
            set.add(x); 
        }
        
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int x: nums2){
            if(set.contains(x)){
                set2.add(x);
            }
        }
        
        Object []array = set2.toArray();
        int []returnArray = new int[set2.size()];
        for(int i = 0 ; i<returnArray.length; i++){
            returnArray[i] = (int) array[i];
        }
        
        return returnArray;
    }
}
