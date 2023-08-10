/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(1))
            return 1;
        int start = 1;
        int end = n;
        int pos = 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean isBad = isBadVersion(mid);
            if (isBad){
                pos = mid;
                end = mid-1;
            }else
              start = mid+1;  
        }
        return pos;
}
}