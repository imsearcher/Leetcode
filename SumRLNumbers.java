//#129 Sum Root to Leaf Numbers
public class SumRLNumbers{
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    int total;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        fetch(root,String.valueOf(root.val));
        return total;
    }
    public void fetch(TreeNode root,String number){
        
        if(root.left==null&&root.right==null){
            total+=Integer.valueOf(number);
            return;
        }
        
        if(root.left!=null)
            fetch(root.left,number+String.valueOf(root.left.val));
        if(root.right!=null)
            fetch(root.right,number+String.valueOf(root.right.val));
        
    }
    
}