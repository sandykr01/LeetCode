/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode temp = headA;
        while(temp!=null){
            sizeA++;
            temp = temp.next;
        }
        
        temp = headB;
        while(temp!=null){
            sizeB++;
            temp = temp.next;
        }
        
        int difference = Math.abs(sizeA-sizeB);
        // System.out.println(difference);
        
        ListNode bda = sizeA>sizeB?headA:headB;
        ListNode chota = bda==headA?headB:headA;
        
        while(difference>0){
            bda = bda.next;
            difference--;
        }
        // System.out.println(bda.val);
        
        while(bda!=chota && bda!=null && chota!=null){
            bda = bda.next;
            chota = chota.next;
        }
        
        if(bda==chota && bda!=null) return chota;
        
        return null;
    }
}