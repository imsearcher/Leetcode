//#257 BinaryTreePaths
import java.util.*;
public class BinaryTreePaths {
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
 
    List<String> paths=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
            
        if(root==null)
            return paths;
        traversal(root,String.valueOf(root.val));
        return paths;
            
    }
    public void traversal(TreeNode root,String path){
        
        if(root.left==null&&root.right==null){
            paths.add(path);
            return;
        }
            
      
        if(root.left!=null)
            traversal(root.left,path+"->"+root.left.val);
        if(root.right!=null)
            traversal(root.right,path+"->"+root.right.val);
        
    }
    
}