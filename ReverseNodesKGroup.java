//#25 Reverse Nodes in K Group

public class ReverseNodesKGroup {
    public class ListNode {
 	    int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode runner=head;
        ListNode pre=null;
        int count=1;
        int kCount=0;
        if(k<2)
            return head;
        while(runner!=null)
        {
            runner=runner.next;
            if(count%k==0){
               kCount++;
            }
            count++;
        }
        runner=head;
        ListNode cur=dummy;
        count=1;
        while(runner!=null)
        {
            if(kCount==0){
                cur.next=runner;
                break;
            }
                
            ListNode tmp=cur.next;
           
            cur.next=runner;
            if(tmp==null)
                pre=runner;
           
            runner=runner.next;
            cur.next.next=tmp;
            if(count%k==0){
                kCount--;
                cur=pre; 
            }
            
            count++;
           
        }
       
        return dummy.next;
    }
}