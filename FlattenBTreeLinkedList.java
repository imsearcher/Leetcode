//#114 Flatten Binary Tree to Linked List
public class FlattenBTreeLinkedList {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    public void flatten(TreeNode root) {
        
        if(root==null)
            return;
        traversal(root);
        
        
    }
    public TreeNode traversal(TreeNode node){
        
        
        if(node.left==null&&node.right==null)
            return node;
        
        TreeNode left=null;
        TreeNode right=null;
        TreeNode runner=null;
        TreeNode tmp=node.right;
        if(node.left!=null){
            left=traversal(node.left);
            runner=left;
            while(runner.right!=null){
                runner=runner.right;
            }
        }
        if(tmp!=null)
            right=traversal(tmp);
        if(runner!=null){       
            runner.right=right;
            node.right=left;  
        }else{
            node.right=right;
        }
        
        node.left=null;
        return node;
    }
}