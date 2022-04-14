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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> st = new Stack<>();
        
        while(fast!=null && fast.next!=null){
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast!=null) slow = slow.next; // In case of odd number of nodes skip the middle one
        
        while(slow!=null){
            int val = st.pop(); 
            if(val!=slow.val) return false;
            slow = slow.next;
        }
        
        return true;
    }
}