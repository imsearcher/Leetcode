public class PartitionList {
     /**
     * Definition for singly-linked list.
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }
 
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)
            return head;
        ListNode small=new ListNode(0);
        ListNode big=new ListNode(0);
        ListNode smallRunner=small;
        ListNode bigRunner=big;
        
        while(head!=null){
            
            ListNode tmp=head.next;
            if(head.val<x){
               smallRunner.next=head;
               smallRunner.next.next=null;
               smallRunner=smallRunner.next;
            }else{
               bigRunner.next=head;
               bigRunner.next.next=null;
               bigRunner=bigRunner.next;
                
            }
            head=tmp;
        }
        smallRunner.next=big.next;
        return small.next;
    }
}