//#116 Populating Next Right Pointers in Each Node
public class PopNextRightPointers {
    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        
        
        if(root==null)
            return;
            
        TreeLinkNode head=root;
        TreeLinkNode runner=head;
        while(runner.left!=null){
           
            TreeLinkNode pre=null;
            while(runner!=null)
            {
                if(pre!=null)
                    pre.next=runner.left;
                runner.left.next=runner.right;
                pre=runner.right;
                runner=runner.next;
            }
            runner=head;
            if(runner.left==null){
                break;
            }else{
                runner=runner.left;
                head=runner;
            }
            
        }
            
    }
}