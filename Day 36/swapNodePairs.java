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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode prev=head.next;
        ListNode p=head;
        while(p.next!=null && prev!=null){
            int t=prev.val;
            prev.val=p.val;
            p.val=t;

            if(prev.next!=null && p.next!=null){
                prev=prev.next.next;
                p=p.next.next;
            }
            else{
                break;
            }
        }
        return head;
        
    }
}
