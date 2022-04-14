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
    
    public ListNode reverse(ListNode node){
        ListNode pre = null;
        ListNode curr = node;
        ListNode nxt = node.next;
        
        while(nxt!=null){
            curr.next = pre;
            pre = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = pre;
        return curr;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        ListNode list1 = l1;
        while(list1!=null){
            st1.push(list1.val);
            list1 = list1.next;
        }
        // System.out.println(st1);
        
        ListNode list2 = l2;
        while(list2!=null){
            st2.push(list2.val);
            list2 = list2.next;
        }
        // System.out.println(st2);
        
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0;
        while(st1.size()>0 && st2.size()>0){
            int val = st1.pop()+st2.pop()+carry;
            int rem = val%10;
            temp.next = new ListNode(rem);
            temp = temp.next;
            carry = val/10;
        }
        
        while(st1.size()!=0){
            int val = st1.pop()+carry;
            int rem = val%10;
            temp.next = new ListNode(rem);
            temp = temp.next;
            carry = val/10;
        }
        
        while(st2.size()!=0){
            int val = st2.pop()+carry;
            int rem = val%10;
            temp.next = new ListNode(rem);
            temp = temp.next;
            carry = val/10;
        }
        
        if(carry!=0){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        
        // reverse the result linkedlist
        ListNode ans = reverse(head.next);
        
        return ans;
    }
}