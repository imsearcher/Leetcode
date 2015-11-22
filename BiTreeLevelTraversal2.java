//#107 Binary Tree Level Order Traversal II
//Stack
import java.util.*;
public class BiTreeLevelTraversal2 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> list=new ArrayList<List<Integer>>();
            if(root==null)
                return list;
            List<TreeNode> parent=new ArrayList<TreeNode>();
            parent.add(root);
            while(true){
                
                List<Integer> valList=new ArrayList<Integer>();
                List<TreeNode> next=new ArrayList<TreeNode>();
                for(int i=0;i<parent.size();i++){
                    TreeNode tmp=parent.get(i);
                    valList.add(tmp.val);
                    if(tmp.left!=null)
                        next.add(tmp.left);
                    if(tmp.right!=null)
                        next.add(tmp.right);
                }
                list.add(0,valList);
                if(next.size()==0)
                    break;
                parent=next;
            }
            return list;
    }
}