package solved;

import java.util.ArrayList;

public class IntersectionOfTwoArraysII {
	   public int[] intersect(int[] nums1, int[] nums2) {
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int x: nums1){
	            list.add(x); 
	        }
	        
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        for(int x: nums2){
	            if(list.contains(x) && list.size() != 0){
	                int index = list.indexOf(x);
	                list2.add(x);
	                list.remove(list.get(index));
	            }
	        }
	        
	        Object []array = list2.toArray();
	        int []returnArray = new int[list2.size()];
	        for(int i = 0 ; i<returnArray.length; i++){
	            returnArray[i] = (int) array[i];
	        }
	        
	        return returnArray;

	    }
}
