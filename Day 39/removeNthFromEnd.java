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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        
        ListNode temp=head;
        int len=1;
        
        while(temp.next!=null){
            temp=temp.next;
            len+=1;
        }
        if(len==1) return null;
        int k=len-n;
        if(k==0) {
            head=head.next;
            return head;
        }
        ListNode t1=head;
        ListNode t2=null;
        for(int i=0;i<k;i++){
            t2=t1;
            t1=t1.next;
        }
        
        t2.next=t1.next;
        return head;
    }
}
