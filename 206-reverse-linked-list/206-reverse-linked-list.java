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
    static ListNode nhead = null;
    public void reverse(ListNode node){
        if(node.next==null){
            nhead = node;
            return;
        }
        // System.out.println(node.val);
        reverse(node.next);
        node.next.next = node;
        // System.out.println(node.val);
    }
    
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        nhead = null;
        reverse(head);
        head.next = null;
        return nhead;
    }
}