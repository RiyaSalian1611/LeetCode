class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int maxTillNow = nums[0];
        for(int i =0; i< nums.length; i++){
            maxSum = Math.max(nums[i], maxSum+nums[i]);
            if(maxSum > maxTillNow){
                maxTillNow = maxSum;
            }
    }
        return maxTillNow;
}
}