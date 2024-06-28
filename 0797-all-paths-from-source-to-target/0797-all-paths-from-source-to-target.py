class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        
        res =[]
        
        def dfs(node, sublist):
            sublist.append(node)
            #Base condition
            if node == len(graph)-1:
                res.append(sublist.copy())
            else:
                #Explore neighbours
                for neighbour in graph[node]:
                    dfs(neighbour, sublist)
            
            sublist.pop()
                        
        dfs(0, [])
        return res