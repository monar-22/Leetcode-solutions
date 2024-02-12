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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(0);
        ListNode curr= dummy;
        ListNode p1= l1;
        ListNode p2=l2;
        int carry=0;
        
        while(p1!=null || p2!= null){
            int v1 = p1!=null? p1.val : 0;
            int v2 = p2!=null? p2.val : 0;
            
            int sum = v1+v2 +carry;
            carry=sum/10;
            curr.next = new ListNode(sum%10);
            if(p1!=null)
                p1=p1.next;
            if(p2!=null)
                p2=p2.next;
            curr=curr.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}