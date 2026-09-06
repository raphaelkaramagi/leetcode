# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        fast = slow = dummy

        # 1. Advance fast (which starts at dummy node) so the gap between fast and slow is n + 1 nodes
        for i in range(n + 1):
            fast = fast.next

        # 2. Slide both pointers together until fast hits the end
        while fast is not None:
            fast = fast.next
            slow = slow.next

        # 3. Skip the target node
        slow.next = slow.next.next

        return dummy.next

        

        


