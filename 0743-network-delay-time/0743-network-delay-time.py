import heapq as hq

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        #Djikstra's algo using Priority Queue - Min Heap
        # times = [[1,2,1],[2,3,2],[1,3,2]]
        # n=3
        # k=1
        dict_ = {i: [] for i in range(1,n+1)}
        
        for s,e,w in times:
                dict_[s].append([e,w])
        
        li = [(0, k)]
        hq.heapify(li)
        max_dist = 0
        visited = set()

        while len(li )!=0:
            if len(visited)==n:
                break
                
            distance, dest = hq.heappop(li)
            if dest in visited:
                continue
            
            max_dist = max(max_dist, distance)    
            visited.add(dest)   
            
            for neighbour, weight in dict_[dest]:
                if neighbour not in visited:
                    hq.heappush(li, (distance+weight, neighbour))
                    # print(distance+weight, neighbour)
        return max_dist if len(visited) == n else -1
            
            