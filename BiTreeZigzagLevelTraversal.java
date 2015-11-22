//#103 Binary Tree Zigzag Level Order Traversal
import java.util.*;
public class BiTreeZigzagLevelTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           List<List<Integer>> list=new ArrayList<List<Integer>>();
            if(root==null)
                return list;
            List<TreeNode> parent=new ArrayList<TreeNode>();
            parent.add(root);
            boolean left=true;
            while(true){
                
                List<Integer> valList=new ArrayList<Integer>();
                List<TreeNode> next=new ArrayList<TreeNode>();
                for(int i=0;i<parent.size();i++){
                    TreeNode tmp=parent.get(i);
                    if(left)
                        valList.add(tmp.val);
                    else
                        valList.add(0,tmp.val);
                    if(tmp.left!=null)
                        next.add(tmp.left);
                    if(tmp.right!=null)
                        next.add(tmp.right);
                }
                if(left)
                   left=false;
                else
                   left=true;    
                list.add(valList);
                if(next.size()==0)
                    break;
                parent=next;
            }
            return list;
    }
}