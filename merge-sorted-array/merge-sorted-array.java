class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0)
            System.arraycopy(nums2, 0, nums1, 0, n);
        int ptr1 = m-1;
        int ptr2 = n-1;
        int count = m+n-1;

        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1] < nums2[ptr2]){
                nums1[count] = nums2[ptr2];
                ptr2--;
            }else{
                nums1[count] = nums1[ptr1];
                ptr1--;
            }   
            count--;
        }
        // If there are remaining elements in nums2, copy them to nums1
    while (ptr2 >= 0) {
        nums1[count] = nums2[ptr2];
        ptr2--;
        count--;
    }
    }
}