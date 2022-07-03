class Solution {
    public int[] countBits(int n) {
        int [] bitCount = new int[n+1];
        for(int i=0; i<=n; i++){
            int temp=i;
            bitCount[i] = 0;
            while(temp!=0){
                if((temp&1) == 1){
                    bitCount[i]+=1;
                } 
                temp = temp>>1;
            }
        }
        return bitCount;
    }
}