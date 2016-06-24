//#47. Permutations II
import java.util.*;
public class PermutationsII {
    ArrayList<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Arrays.sort(nums);
        int[] visited=new int[nums.length];
        addList(nums,visited,new ArrayList<Integer>());
        return list;
    }
    
    
    public void addList(int[] nums,int[] visited,ArrayList<Integer> preList){
        
        if(preList.size()==nums.length){
            list.add(preList);
            return;
        }
     
        int pre=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
              if(pre==nums[i])
                continue;
            
              if(visited[i]==1)
                continue;
              else
                pre=nums[i];
              ArrayList<Integer> curlist=new ArrayList<Integer>(preList);
              curlist.add(nums[i]);
              visited[i]=1;
              addList(nums,visited,curlist);
              visited[i]=0;
            
        }
        
        
    }
    
}