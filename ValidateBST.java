//#98 ValidateBST
import java.util.*;
public class ValidateBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<TreeNode> list=new ArrayList<TreeNode>();
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        traversal(root);
        if(list.size()<2)
            return true;
        for(int i=1;i<list.size();i++){
            if(list.get(i).val<=list.get(i-1).val)
                return false;
        }
        return true;
        
    }
    
    public void traversal(TreeNode root){
        
        if(root.left==null&&root.right==null)
        {   
            list.add(root);
            return;
        }
        if(root.left!=null){
            traversal(root.left);
        }
        list.add(root);
        if(root.right!=null){
            traversal(root.right);
        }
        
      
        return;
        
    } 
}