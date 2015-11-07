//#63 UniquePathsII
public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        Integer[][] map=new Integer[m][n];
        
        return fetch(m-1,n-1,obstacleGrid,map);
    }
    public int fetch(int m,int n,int[][] grid, Integer[][] map){
        
         if(m==0&&n==0)
            if(grid[m][n]==1)
                return 0;
            else
                return 1;
        
        if(map[m][n]==null){
            if(grid[m][n]==1){
                map[m][n]=0;
            }else{
                if(m==0)
                    map[m][n]=fetch(m,n-1,grid,map);
                else if(n==0)
                    map[m][n]=fetch(m-1,n,grid,map); 
                else
                    map[m][n]=fetch(m-1,n,grid,map)+fetch(m,n-1,grid,map);
            }

        }
        
        return map[m][n];
             
    }
}