//#236 Lowest Common Ancestor of a Binary Tree
//O(n)
public class LCABinaryTree {
   public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return traversal(root,p,q);
      
        
    }
    public TreeNode traversal(TreeNode root, TreeNode p, TreeNode q){
        
          if(root==p||root==q){
            return root;
          }else{
            if(root.left==null&&root.right==null)
                return null;
            TreeNode left=null;
            TreeNode right=null;
            if(root.left!=null)
                left=traversal(root.left,p,q);
            if(root.right!=null)
                right=traversal(root.right,p,q);
            if(left!=null&&right==null)
                return left;
            else if(left==null&&right!=null)
                return right;
            else if(left!=null&&right!=null)
                return root;
            else
                return null;
          }
        
    }
}