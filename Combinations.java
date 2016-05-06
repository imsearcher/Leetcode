//#77 Combinations
import java.util.*;
public class Combinations {
    List<List<Integer>> list =new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        addList(n,1,k,new ArrayList<Integer>());
        return list;
    }
    
    
    public void addList(int n,int index,int k, ArrayList<Integer> previouslist){

        for(int i=index;i<=n;i++){
            if(k-previouslist.size()>n-(i-1))
                return;
            
            ArrayList<Integer> sublist=new ArrayList<Integer>(previouslist);
            sublist.add(i);
            if(sublist.size()==k){
                list.add(sublist);
            }else{
                addList(n,i+1,k,sublist);
            }
        }
    }
}