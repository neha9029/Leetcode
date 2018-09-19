package binarySearch;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    int left =0;
    int right=height.length-1;
    int water = 0;
    int max = 0;
    while(left<right){
         water = (Math.min(height[right],height[left]) * (right-left));
        
         if(water > max){
             max = water;
         }
        if(height[right]>=height[left]){
            left++;
        }
        else{
            right--;
        }
    }
    
    return max;
}
}
