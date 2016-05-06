//#78. Subsets
import java.util.*;
public class Subset {
    List<List<Integer>> list=new  ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        list.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        addSet(nums,0,new ArrayList<Integer>());
        return list;  
    }
    
    
    public void addSet(int[] nums,int index,ArrayList<Integer> currSubset){
        
        for(int i=index;i<nums.length;i++){
            ArrayList<Integer> subset=new ArrayList<Integer>(currSubset);
            subset.add(nums[i]);
            list.add(subset);
            addSet(nums,i+1,subset);    
        }
        
    }
}