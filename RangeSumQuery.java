//#303 Range Sum Query - Immutable
public class RangeSumQuery {
    int[] sum=new int[0];
    public RangeSumQuery(int[] nums) {
       
        if(nums==null||nums.length==0)
            return;     
        sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            if(i>0)
                sum[i]=nums[i]+sum[i-1];
            else
                sum[i]=nums[i];
        }
        
        
    }

    public int sumRange(int i, int j) {
        if(sum.length==0)
            return 0;
        int tmp=0;
        if(i>0)
            tmp=sum[i-1];            
        return sum[j]-tmp;
    }
}

