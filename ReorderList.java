//#143 Reorder List
//can use fast and slow runner to reduce the number of loops 
public class  ReorderList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 	 }
    public void reorderList(ListNode head) {
        if(head==null)
            return;
        ListNode runner=head;
        ListNode secHead=new ListNode(0);
        ListNode dummy=new ListNode(0);
        ListNode secRunner=null;
        int total=0;
        while(runner!=null)
        {
            total++;
            runner=runner.next;
        }
        int count=0;
        if(total%2==1)
            count=total/2+1;
        else
            count=total/2;
        total=0;
        runner=head;
        while(runner!=null)
        {
            total++;
            if(total==count){
                secRunner=runner.next;
                runner.next=null;
                break;
            }
            runner=runner.next;
        }
        while(secRunner!=null)
        {
            ListNode tmp=secHead.next;
            secHead.next=secRunner;
            secRunner=secRunner.next;
            secHead.next.next=tmp;
            
        } 
        runner=head;
        secRunner=secHead.next;
        
        while(runner!=null&&secRunner!=null)
        {
            ListNode l1=runner.next;
            ListNode l2=secRunner.next;
            runner.next=secRunner;
            secRunner.next=null;
            dummy.next=runner;
            dummy=secRunner;
            runner=l1;
            secRunner=l2;
            
        }   
        if(runner!=null)
            dummy.next=runner;
    }
}