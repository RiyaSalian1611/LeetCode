class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        open_ = '('
        close_ =')'
        res = []
        
        def permute(string, o_count, c_count):
                
            if o_count< n: permute(string+open_, o_count+1, c_count)  
            if c_count < o_count: permute(string+close_, o_count, c_count+1)
            
            if len(string) == 2*n and c_count==o_count:
                res.append(string)

        permute('', 0, 0)
        return res