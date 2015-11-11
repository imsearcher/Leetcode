//#70 ClimbingStairs
public class ClimbingStairs {
    public int climbStairs(int n) {
   
        if(n==0)
            return 0;
        
        int[] result=new int[n+1];
        for(int i=0;i<result.length;i++ )
            result[i]=0;
       
        
        return  fetch(n,result); 
    }
    public int fetch(int n, int[] result){
        
 
        if(n==1)
            return 1;
        if(n==2)
            return 2;
            
        if(result[n]==0)
            result[n]=fetch(n-1,result)+fetch(n-2,result);
        return result[n];

    }
}