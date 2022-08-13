class Solution {
    public void moveZeroes(int[] nums) {
        int ptr1 = 0; int ptr2 = 0;
        
        while(ptr1 != nums.length){
            if(ptr2 == nums.length){
                for(int i=ptr1; i< nums.length; i++){
                    nums[ptr1] = 0;
                    ptr1++;
                }
                break;
            }
            if(nums[ptr2]!=0){
                nums[ptr1] = nums[ptr2];
                ptr1++;
            }
            ptr2++;
        }
    }
}