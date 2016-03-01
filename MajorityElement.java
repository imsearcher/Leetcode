//#169. Majority Element
public class MajorityElement {
    public int majorityElement(int[] nums) {
        
        int candidate=nums[0];
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(candidate==nums[i]){
                count++;
            }else{
                if(count>0)
                    count--;
                else
                    candidate=nums[i];
            }
        }
        return candidate;
    }
}