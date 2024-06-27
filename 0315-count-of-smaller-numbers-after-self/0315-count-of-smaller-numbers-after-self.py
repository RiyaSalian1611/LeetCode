class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        nums_sorted = sorted(nums)
        result = []
        
        def binarySearch_left(arr, target):
            start = 0
            end = len(arr)-1
            res = 0
            while start <= end:
                mid = (start+end)//2
                if arr[mid] == target:
                    res = mid
                    end = mid-1
                elif target > arr[mid]:
                    start = mid+1
                else:
                    end = mid-1
            return res
        
        temp = nums_sorted
        for i in range(len(nums)):
            index_found = binarySearch_left(temp, nums[i])
            result.append(index_found)
            temp.pop(index_found)
        
        return result
        
        