class Solution {
    public boolean isSubIsland = false;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int count = 0;

        for(int i=0; i< grid2.length; i++){
            for(int j=0; j<grid2[0].length; j++){
                isSubIsland = true;
                if(grid2[i][j] == 1 ){
                    findConnectedComponents(i, j, grid2, grid1);
                 if(isSubIsland)   
                     count++; 
                }                 
            }
        }
        return count;
    }
    private void findConnectedComponents(int i, int j, int[][] grid2, int[][] grid1){
        if(i<0 || j<0 || i>grid1.length-1 || j>grid1[0].length-1 || grid2[i][j] !=1)
            return;

        if(grid2[i][j] != grid1[i][j])
            isSubIsland = false;
            
        grid2[i][j]=2;
        findConnectedComponents(i+1, j, grid2, grid1);
        findConnectedComponents(i-1, j, grid2, grid1);
        findConnectedComponents(i, j+1, grid2, grid1);
        findConnectedComponents(i, j-1, grid2, grid1);
    }
}