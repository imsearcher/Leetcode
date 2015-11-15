//#234 Palindrome Linked List
public class PalindromeLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        int size=0;
        ListNode dummy=new ListNode(0);
        ListNode runner=head;
        while(runner!=null){
            size++;
            runner=runner.next;
        }
        int i=0;
        runner=head;
        
        while(i<size/2){
            i++;
            ListNode tmp=dummy.next;
            dummy.next=runner;
            runner=runner.next;
            dummy.next.next=tmp;
        }
        dummy=dummy.next;
        if(size%2==1)
            runner=runner.next;
        while(runner!=null){
            
            if(dummy.val!=runner.val)
                return false;
            dummy=dummy.next;
            runner=runner.next;
        }
        
        
        return true;
    }
}