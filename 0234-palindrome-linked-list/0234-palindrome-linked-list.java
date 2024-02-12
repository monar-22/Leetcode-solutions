/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode forw = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head ==  null || head.next==null)
            return true;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode h2 = slow.next;
        slow.next = null;
        h2 = reverse(h2);
        while(h2!=null){
            if(h2.val != head.val)
                return false;
            
            head=head.next;
            h2=h2.next;
        }
        return true;
    }
}