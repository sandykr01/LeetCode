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
    public ListNode reverse(ListNode curr){
        ListNode pre = null;
        ListNode nxt = curr.next;
        while(nxt!=null){
            curr.next = pre;
            pre = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = pre;
        return curr;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode nhead = reverse(head);
        return nhead;
    }
}