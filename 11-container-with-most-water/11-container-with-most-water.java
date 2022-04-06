class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int maxArea = 0;
        
        while(ptr1 < ptr2){
            int lHeight = Math.min(height[ptr1], height[ptr2]);            
            maxArea = Math.max(maxArea, lHeight*(ptr2-ptr1));
            if(height[ptr2] < height[ptr1])
                ptr2--;
            else
                ptr1++;
        }
        return maxArea;
    }
}