class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2)
            return nums[0];
        
        int [] DP = new int[nums.length];
        DP[0] = nums[0];
        DP[1] = Math.max(nums[1], nums[0]);
        
        for(int i=2; i<nums.length; i++){
            DP[i] = Math.max(DP[i-2]+nums[i], DP[i-1]);
        }
        return DP[nums.length-1];
    }
}