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
    public ListNode findMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(h1!=null && h2!=null){
            if(h1.val>=h2.val){
                temp.next=h2;
                h2=h2.next;
            }
            else{
                temp.next=h1;
                h1=h1.next;
            }
            temp=temp.next;
        }
        while(h1!=null){
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findMid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=head;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
}
