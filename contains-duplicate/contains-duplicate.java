class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ht = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!ht.contains(nums[i]))
                ht.add(nums[i]);
            else
                return true;
        }
        return false;
    }
}