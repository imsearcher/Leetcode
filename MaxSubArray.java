public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums==null)
            return 0;
        if(nums.length<2)
            return nums[0];
       //return getMax(nums,0,nums.length-1);
        return dpMax(nums);        
    }
    public int getMax(int[] nums,int l ,int r){
        
        if(l>=r)
            return nums[l];
        int mid=(l+r)/2;
        int lmax=getMax(nums,l , mid-1);
        int rmax=getMax(nums,mid+1,r);
        
        
        int lsum=0;
        int mlmax=0;
        int rsum=0;
        int mrmax=0;
        for(int i=mid-1;i>=l;i--){
            
            lsum+=nums[i];
            if(lsum>mlmax)
                mlmax=lsum;
        }
        for(int j=mid+1;j<=r;j++){
            rsum+=nums[j];
            if(rsum>mrmax)
                mrmax=rsum;
        }
        int tmp=mlmax+mrmax+nums[mid];
        
        return Math.max(Math.max(lmax,rmax),tmp);
            
        
    }
    public int dpMax(int[] nums){
        if(nums==null)
             return 0;
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
        
        
    }
    
}