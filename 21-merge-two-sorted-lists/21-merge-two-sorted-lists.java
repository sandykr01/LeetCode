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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-101); //dummy node which will keep track of head
        ListNode pre = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                pre.next = curr1;
                curr1 = curr1.next;
            }else{
                pre.next = curr2;
                curr2 = curr2.next;
            }
            // System.out.println(pre.val);
            pre = pre.next;
        }
        
        pre.next = curr2!=null?curr2:curr1;
        
        // This is the proper way to return new head:-
        // ListNode head = dummy.next;  
        // dummy.next = null;
        
        return dummy.next;
    }
}