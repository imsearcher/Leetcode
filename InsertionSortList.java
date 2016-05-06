//147. Insertion Sort List
public class InsertionSortList {
    public class ListNode {
    	int val;
     	ListNode next;
     	ListNode(int x) { val = x; }
    }
    public ListNode insertionSortList(ListNode head) {
         
        ListNode dummy=new ListNode(0);
        ListNode runner=head;
        
        while(runner!=null){
            head=head.next;
            runner.next=null;
            ListNode dummyRunner=dummy;
            
            while(dummyRunner!=null){
                if(dummyRunner.next==null){
                    dummyRunner.next=runner;
                    break;
                }else{
                    if(runner.val<dummyRunner.next.val){
                        ListNode tmp=dummyRunner.next;
                        dummyRunner.next=runner;
                        runner.next=tmp;
                        break;
                    }
                }
                dummyRunner=dummyRunner.next;     
            }
            runner=head;
            
           
            
        }
        return dummy.next;
    }
}