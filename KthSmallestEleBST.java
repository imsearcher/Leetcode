//#230 Kth Smallest Element in a BST
//Try to utilize the property of a BST.
//What if you could modify the BST node's structure?
//The optimal runtime complexity is O(height of BST).
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class KthSmallestEleBST {
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
    List<TreeNode> list=new ArrayList<TreeNode>();
    
    public int kthSmallest(TreeNode root, int k) {
        traversal(root);
        return list.get(k-1).val;
    }
    public void traversal(TreeNode node){
        
        if(node.left==null&&node.right==null){
            list.add(node);
            return;
        }
        if(node.left!=null)
            traversal(node.left);
        list.add(node);
        if(node.right!=null)
            traversal(node.right);
  
      
    }
    
    
}