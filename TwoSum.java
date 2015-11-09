import java.util.*;
//need improvement
//#1 Two Sum
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] index=new int[2];
        HashMap<Integer,Integer> numbers=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            numbers.put(nums[i],i);
        }
        
        int index1=0;
        int index2=0;
        for(int i=0;i<nums.length;i++){
            
            if(numbers.containsKey(Integer.valueOf(target-nums[i]))){
                index1=numbers.get(Integer.valueOf(target-nums[i]));
                if(index1==i)
                    continue;
                else
                    index1++;
                index2=i+1;
                break;
                 
            }
        }
        if(index1>index2){
            index[0]=index2;
            index[1]=index1;
        }else{
            index[0]=index1;
            index[1]=index2;
        }
        return index;
    }
}