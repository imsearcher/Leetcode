//#108 Convert Sorted Array to Binary Search Tree
public class SortedArrayBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)
            return null;
        return cons(nums,0,nums.length-1);
    }
    public TreeNode cons(int[] nums,int l,int r ){
        if(l>r)
            return null;
        int mid=(l+r)/2;
        
        TreeNode node=new TreeNode(nums[mid]);
        node.left=cons(nums,l,mid-1);
        node.right=cons(nums,mid+1,r);
      
        return node;
    }
}