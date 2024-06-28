class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        
        def dfs(i, j, word, wordIndex):
            
            if wordIndex == len(word):
                return True
            
            if ((i<0 or i>len(board)-1) or (j<0 or j>len(board[0])-1) or 
                (word[wordIndex] != board[i][j]) or ( board[i][j] == '$')):
                return
        
            temp = board[i][j]
            
            if word[wordIndex] == board[i][j]:
                board[i][j] = '$'
                wordIndex +=1
                
            if dfs(i+1, j, word, wordIndex): return True
            if dfs(i-1, j, word, wordIndex): return True
            if dfs(i, j-1, word, wordIndex): return True
            if dfs(i, j+1, word, wordIndex): return True
            
            board[i][j] = temp
            
            return False
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == word[0]:
                    if dfs(i, j, word, 0):
                        return True
                
        return False