//#46 Permutations
//
import java.util.*;
public class Permutations {
    List<List<Integer>> sol=new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> n=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            n.add(nums[i]);
        cal(n.size(),n,new ArrayList<Integer>());
        return sol;
    }
    public void cal(int n, ArrayList<Integer> remain,ArrayList<Integer> curr){
      
        for(int i=0;i<remain.size();i++){
              ArrayList<Integer> result=new ArrayList<Integer>();
              result.addAll(curr);
              result.add(remain.get(i));
              ArrayList<Integer> nextRemain= (ArrayList) remain.clone();
              nextRemain.remove(remain.get(i));
              if(n==1)
                sol.add(result);
              else
                cal(n-1,nextRemain,result);
            
        }
    }
}