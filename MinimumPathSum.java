//#64
//Given a m x n grid filled with non-negative numbers,
// find a path from top left to bottom right which minimizes the sum of all numbers along its path.
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
       
        int m=grid.length;
        int n=grid[0].length;
        Integer[][] min=new Integer[m][n];
        return fetch(m-1,n-1,grid,min);
      
        
    }
    public int fetch(int m,int n,int[][] grid, Integer[][] map){

        if(n==0&&m==0)
            return grid[m][n];
        if(map[m][n]==null){
            if(n==0)
                map[m][n]=fetch(m-1,n,grid,map)+grid[m][n];
            else if(m==0)
                map[m][n]=fetch(m,n-1,grid,map)+grid[m][n];
            else
                map[m][n]=Math.min(fetch(m-1,n,grid,map),fetch(m,n-1,grid,map))+grid[m][n];
        }
        return map[m][n];
        
    }
   
}