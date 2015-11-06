/*#62
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time.
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?
*/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        Integer[][] map=new Integer[m+1][n+1];
        return fetch(m,n,map);
    }
    
    public int fetch(int m,int n, Integer[][] map){
        
        if(n==0||m==0)
            return 0;
        if(n==1||m==1)
            return 1;
        
        if( map[m][n]==null)
            map[m][n]=fetch(m-1,n,map)+fetch(m,n-1,map);
        
        return map[m][n];
        
    }
}