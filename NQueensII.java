//#52. N-Queens II 
public class NQueensII {
    int total=0;
    public int totalNQueens(int n) {
        int[] nums=new int[n];
        int[] visited=new int[n];
        
        fetch(0,n,nums,visited);
        return total;
    }
    
    
    public void fetch(int index, int n, int[] nums,int[] visited){
        if(index==n){
            total++;
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(visited[i]!=1){
                
                boolean valid=true;
                for(int j=0;j<index;j++){
                    int row=index-j;
                    int col=Math.abs(nums[j]-i);
                    if(row==col)    
                        valid=false;
                }
                if(!valid)
                    continue;
                
                nums[index]=i;
                visited[i]=1;
                fetch(index+1,n,nums,visited);
                visited[i]=0;
            }   
            
        }
        
    }
}
