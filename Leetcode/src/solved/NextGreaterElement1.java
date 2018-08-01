package solved;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement1 {
	
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] array = new int[nums1.length];
        for(int i = 0; i< nums2.length; i++){
            list.add(nums2[i]);
        }

        for(int x = 0; x<nums1.length;x++){
            int index = list.indexOf(nums1[x]);
            int element = list.get(index);
             if(index == nums2.length-1){
                array[x] = -1;
            }
             else{
                 
                array[x] = findInSubList( element, index, list);
             }
        }
               
        
        return array;
        
    }
    
    
    public int findInSubList( int target, int index, List<Integer> list){
       List<Integer> list2 = list.subList(index, list.size());
        System.out.println(list2);
        for(int x: list2){
            if(x > target){
                return x;
            }
            
        }
        
        return -1;
        
    }

}
