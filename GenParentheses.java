//#22 Generate Parentheses
import java.util.*;
public class GenParentheses {
    List<String> result=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        getParenthesis(n,n,new String());
        return result;
    }
    
    public void getParenthesis(int left,int right,String str){
        if(left<0||right<left)return;
        
        if(left==0&&right==0){
            result.add(str);
            return;
        }
        if(left>0){
            getParenthesis(left-1,right,str+"(");
        }
        if(right>left){
            getParenthesis(left,right-1,str+")");
            
        }
        
        return;
    }
}