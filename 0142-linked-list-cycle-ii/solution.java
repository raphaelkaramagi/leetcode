/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       // Slow and fast pointer. Fast goes twice as fast as slow
        // When fast == slow, reset slow to start of list
        // Make fast go at same speed of slow
        // Where they meet again is where the loop starts

        if(head == null) return null;
        if(head.next == null) return null;
        else if (head.next.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        do{
            if(slow == null || fast == null) return null;
            else if (slow.next == null || fast.next == null) return null;
            else if (slow.next.next == null || fast.next.next == null) return null;

            slow = slow.next;
            fast = fast.next.next;
        } while(slow != fast);

        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        if(slow == fast){
            return slow;
        }

    return null;
    } 
    
}
