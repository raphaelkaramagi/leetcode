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
    public boolean hasCycle(ListNode head) {
        // Slow and fast pointer. Fast goes twice as fast as slow
        // When fast == slow, reset slow to start of list
        // Make fast go at same speed of slow
        // Where they meet again is where the loop starts

        if(head == null) return false;
        if(head.next == null) return false;
        else if (head.next.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        do{
            if(slow == null || fast == null) return false;
            else if (slow.next == null || fast.next == null) return false;
            else if (slow.next.next == null || fast.next.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        } while(slow != fast);

        if(slow.val == fast.val){
            return true;
        }

    return false;
    }
}
