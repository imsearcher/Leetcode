//#101 Symmetric Tree
import java.util.*;
public class SymmetricTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    List<Integer> left=new ArrayList<Integer>();
    List<Integer> right=new ArrayList<Integer>();
   
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        // left.clear();
        // right.clear();
        // preorder(root);
        // postorder(root);
        // for(int i=0;i<left.size();i++){
        //     if(left.get(i)!=right.get(i))
        //         return false;
        // }
        return traversal(root.left,root.right);
    }
    public boolean traversal(TreeNode left,TreeNode right){
        
        if(left==null&&right==null)
            return true;
        else if(left==null||right==null)
            return false;
        
        if(left.val!=right.val)
            return false;
            
        return traversal(left.left,right.right)&&traversal(left.right,right.left);
        
        
    }
    public void preorder(TreeNode root){
        if(root==null){
            left.add(-1);
            return;
        }
        left.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null){
            right.add(-1);
            return;
        }
        right.add(root.val);
        postorder(root.right);
        postorder(root.left);
        
        
        return;
    }
}