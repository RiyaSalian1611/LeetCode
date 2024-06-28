class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        
        dict_ = {i : [] for i in range(n)}
        
        for u,v in edges:
            dict_[u].append(v)
            dict_[v].append(u)
                   
        visited = set()
        
        def dfs(node):
            if destination == node:
                return True
            
            visited.add(node)
            
            for neighbour in dict_[node]:   
                if neighbour not in visited:
                    if dfs(neighbour):
                        return True
            return False
                
        if source == destination:
            return True
        
        return dfs(source)    
        
                
                    
                        
            