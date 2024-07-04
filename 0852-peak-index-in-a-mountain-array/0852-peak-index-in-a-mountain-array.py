class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        #Binary search
        start=0
        end = len(arr)-1
        mid = -1
        
        while start<=end:
            
            mid = (start+end)//2
            
            if (mid!=0 and mid!=len(arr)-1):
                if arr[mid-1]<arr[mid] and arr[mid+1]<arr[mid]:
                    return mid
                elif arr[mid-1]<arr[mid] and arr[mid+1]>arr[mid]:
                    start+=1
                else:
                    end-=1
            
        return mid