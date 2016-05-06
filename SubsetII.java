//#90 Subset 2
import java.util.*;
public class SubsetII {
    
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> emptyList=new ArrayList<Integer>();
        list.add(emptyList);
        addList(nums,0,emptyList);
        return list;
    }
    
    public void addList(int[] nums,int index, ArrayList<Integer> pList){
        
        int p=0;
        for(int i=index;i<nums.length;i++){
            ArrayList<Integer> sublist=new ArrayList<Integer>(pList);
            if(i>index&&nums[i]==p){    
                continue;
            }else{
                sublist.add(nums[i]);
                p=nums[i];
            }
            list.add(sublist);
            addList(nums,i+1,sublist);
                
        }    
    }
}