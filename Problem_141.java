// 141. LinkedList Cycle (EASY) (SOLVED) 
// Key insights - Tortoise and Hare algorithm 
// Init both pointers at start of list, they follow list but fasst pointer moves twice as fast
// If the two pointers meet, that means there's a loop in the list
// More nuance for finding start of the loop in problem 142.

/* More efficient Claude version:
* public boolean hasCycle(ListNode head) {
    if (head == null) return false;
    
    ListNode slow = head;
    ListNode fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    
    return false;
}
 * 
 */

public class Problem_141 {
    
    public boolean hasCycle(ListNode head) {
        // This is Tortoise and hare thing
        // Slow and fast pointer. Fast goes twice as fast as slow
        // When fast == slow, reset slow to start of list
        // if fast and slow are equal, there is a loop

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

        if(slow == fast){
            return true;
        }
        
    return false;
    }
}
