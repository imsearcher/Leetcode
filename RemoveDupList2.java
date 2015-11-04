/**
 * #82
 */
  
public class RemoveDupList2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  	 }
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null||head.next==null)
            return head;
        ListNode dummy=new ListNode(0);
        ListNode newHead=new ListNode(Integer.MIN_VALUE);
        newHead.next=head;
        ListNode runner=dummy;
        int counter=0;
        while(newHead.next!=null){
            ListNode tmp=newHead.next.next;
            if(tmp!=null&&newHead.next.val==tmp.val)
            {   
                counter++;
                newHead=newHead.next;
            }else{
                if(counter==0){
                  runner.next=newHead.next;
                  newHead.next=tmp;
                  runner=runner.next;
                  runner.next=null;
                }
                else{
                  counter=0;
                newHead=newHead.next;
                }
            }
           
            
        }
        return dummy.next;
    }
}