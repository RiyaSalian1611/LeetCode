class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        target = 0
        res_ = []
        nums.sort() #O(nlogn)
        
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
                
            target_i = target - nums[i]
            start = i+1
            end= len(nums)-1
            
            while start<end:
                if nums[end] + nums[start] == target_i:
                    res_.append([nums[i],nums[start],nums[end]])
                    
                    while start<end and nums[start] == nums[start+1]:    
                        start+=1
                    while start<end and nums[end] == nums[end-1]:    
                        end-=1
                    
                    start += 1
                    end -= 1
                elif target_i < nums[end]+ nums[start]:
                    end-=1
                else:
                    start+=1
        return res_