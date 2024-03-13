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
    public ListNode middleNode(ListNode head) { 
        ListNode temp=head;
        ListNode res=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int mid=(l/2);
        while(mid>0){
            res=res.next;
            mid--;
        }
        
        return res;
    }
}