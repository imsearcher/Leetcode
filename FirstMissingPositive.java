//#41. First Missing Positive
//O(n) time, O(n) space
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return 1;
        int[] tmp=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<1||nums[i]>nums.length)
                continue;
            else
                tmp[nums[i]-1]=1;
        }
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]!=1)
                return i+1;
        }
        return tmp.length+1;
        
    }
}