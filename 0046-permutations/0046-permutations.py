class Solution(object):

    def backtrack(self, arr, pos, partial):
        if len(pos) == 0:
            arr.append(partial)
        else:
            for i,p in enumerate(pos):
                self.backtrack(arr, pos[:i] + pos[i+1:], partial + [p])


    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        arr = []
        self.backtrack(arr, nums, [])
        return arr

        