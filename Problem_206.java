// 206. Reverse Linked List (EASY) (SOLVED)
// Took time. Key insight, need to duplicate whole list so each value will need a new node.
// Create a copy of original list (ListNode next = current.next), and then assign the new list current.next to 
// the previous node. Update the previous node and update current. 

// Step 1. Set nodes for previous (previous = null), and current (current = head)
// Step 2. Save the next node (ListNode next = current.next)
// Step 3. Reverse the link (current.next = previous)
// Step 4. Move previous to current (previous = current)
// Step 5. Move current to next (current = next)
// Step 6. Repeat as long as current != null

public class Problem_206 {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
    
        while (current != null) {
            ListNode next = current.next;  
            current.next = previous;       
            previous = current;        
            current = next;             
        }
    return previous;  
    }
}
