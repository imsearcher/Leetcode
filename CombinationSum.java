//#39 Combination Sum
import java.util.*;
public class CombinationSum {
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        addList(0,candidates,target,new ArrayList<Integer>(),0);
        return list;
        
    }
    
    
    public void addList(int index, int[] candidates, int target, ArrayList<Integer> pList,int pSum){
        
        int sum=0;
        for(int i=index;i<candidates.length;i++){
            sum=pSum;
            ArrayList<Integer> sublist=new ArrayList<Integer>(pList);
            sublist.add(candidates[i]);
            sum+=candidates[i];
            if(sum<target)
                addList(i,candidates,target,sublist,sum); 
            else if(sum==target){
                list.add(sublist);
                return;
            }else
                return;    
            
        }
        
    }
}