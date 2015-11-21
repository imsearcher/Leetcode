//#238 Product of Array Except Self
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                result[i]=p==0?0:1;
            }else{
                p=nums[i-1]*p;
                result[i]=p;
            } 
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            
            if(i==nums.length-1){
                result[i]*=p==0?0:1;
            }else{
                p=nums[i+1]*p;
                result[i]*=p;
            } 
        }
        
        return result;
    }
}