// 142. Linked List Cycle II (MEDIUM) (SOLVED)
// Similar to problem 141 but it outputs the node where the cycle starts

/*
 * Optimal Claude Version
 * 
 * public ListNode detectCycle(ListNode head) {
    if (head == null) return null;
    
    ListNode slow = head;
    ListNode fast = head;
    
    // Phase 1: Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) break;
    }
    
    // No cycle found
    if (fast == null || fast.next == null) return null;
    
    // Phase 2: Find cycle start
    slow = head;
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    
    return slow;
}
 */

public class Problem_142 {
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
