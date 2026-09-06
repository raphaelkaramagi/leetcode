# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # Tortoise and hare algorithm 
       
        if head is None or head.next is None:
            return False

        # 2 Pointers, 1 fast and one slow. If fast reaches None, there's no cycle
        # If they meet, there is a cycle
        # To find start of cycle (pos), one they meet, move fast back to head
        # Then increment boht pointers by 1 until they meet, where they meet is pos
        fast = head
        slow = head

        while(fast is not None):
            if fast.next is None:
                return False
            fast = fast.next.next
            slow = slow.next

            if fast is slow:
                return True
                
        return False


