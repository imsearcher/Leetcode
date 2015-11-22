//#199 Binary Tree Right Side View
import java.util.*;
public class BiTreeRightSideView {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> list=new ArrayList<Integer>();
            if(root==null)
                return list;
            List<TreeNode> parent=new ArrayList<TreeNode>();
            parent.add(root);
            while(true){
                List<TreeNode> next=new ArrayList<TreeNode>();
                list.add(parent.get(parent.size()-1).val);
                for(int i=0;i<parent.size();i++){
                    TreeNode tmp=parent.get(i);
                    if(tmp.left!=null)
                        next.add(tmp.left);
                    if(tmp.right!=null)
                        next.add(tmp.right);
                }
               
                if(next.size()==0)
                    break;
                parent=next;
            }
            return list;
    }
}