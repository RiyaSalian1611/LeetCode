class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0; int ptr = -1;
        for(int i=0; i<nums.length; i++){
            if(i+1 <= nums.length-1 && nums[i] == nums[i+1])
                continue;
            else{
                ptr++; count++; 
                nums[ptr] = nums[i];
            }
        }
        return count;
    }
}