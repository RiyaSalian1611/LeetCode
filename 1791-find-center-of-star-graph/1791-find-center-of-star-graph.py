class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        dict_ = {i: [] for i in range(1,len(edges)+2)}

        for u,v in edges:
            if u in dict_:
                dict_[u].append(v)
                if len(dict_[u]) > 1:
                    return u
            else:
                dict_[u] = [v]
                
            if v in dict_:
                dict_[v].append(u)
                if len(dict_[v])> 1:
                    return v
            else:
                dict_[v] = [u]
            
        return -1