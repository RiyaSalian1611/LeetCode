class Solution {
    public int climbStairs(int n) {
          int l1=1; int l2=1;
        for(int i=0; i<n-1; i++){
            int temp = l1;
            l1 = l1 + l2;
            l2 = temp;
        }
        return l1;
    }
}