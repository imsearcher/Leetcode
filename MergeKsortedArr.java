/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKsortedArr {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0)
            return null;
        return helper(lists,0,lists.length-1);
    }
    public ListNode helper(ListNode[] lists, int l,int r){
        if(l>=r)
            return lists[l];
        int mid=(l+r)/2;
        return merge(helper(lists,l,mid),helper(lists,mid+1,r));
    }
    
    public ListNode merge(ListNode l1,ListNode l2){
        
        ListNode newHead=new ListNode(0);
        ListNode cur=newHead;   
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                cur.next=l2;
                l2=l2.next;
            }else{
                cur.next=l1;
                l1=l1.next;
            }
            cur=cur.next;
            
        }
        if(l1==null)
            cur.next=l2;
        if(l2==null)
            cur.next=l1;
        
        return newHead.next;
    }
}