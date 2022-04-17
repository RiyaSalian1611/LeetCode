class Solution {
    public int trap(int[] height) {
             
        int length = height.length;
        int  ptr1 = 1;
        int ptr2 = length-2;
        int rainWaterVolumeCount = 0;
        
        int [] left = new int[length];
        int [] right = new int[length];
        left[0] = height[0];
        right[length-1] = height[length-1];
            
        while(ptr1 < length){
            
            if(height[ptr1] < left[ptr1-1])
                left[ptr1] = left[ptr1-1];
            else
                left[ptr1] = height[ptr1];
            
            if(height[ptr2] < right[ptr2+1])
                right[ptr2] = right[ptr2+1];
            else
                right[ptr2] = height[ptr2];
            
            ptr1++;
            ptr2--;
        }
        
        ptr2 = 0;
        while(ptr2 < length){
            rainWaterVolumeCount += Math.min(left[ptr2], right[ptr2]) - height[ptr2];
            ptr2++;
        }
        return rainWaterVolumeCount;
    }
}