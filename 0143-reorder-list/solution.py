# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        # Going left, right, left +1, right-1 etc.
        # Find middle and reverse second half and splice 

        # To find middle, use tortoise and hare, when fast reaches end, 
        fast = head
        slow = head

        # Finding midpoint
        while(fast is not None):
            if fast.next is None:
                break
            elif fast.next.next is None:
                break
            fast = fast.next.next
            slow = slow.next

        curr = slow.next
        slow.next = None
        prev = None
        secondStart = None

        # Reverse second half
        while curr is not None:
            temp = curr.next
            curr.next = prev
            if temp is None:
                secondStart = curr
            prev = curr
            curr = temp

        # Splicing together
        firstStart = head
        while firstStart is not None:
            temp = firstStart.next
            firstStart.next = secondStart
            if secondStart is not None:
                temp2 = secondStart.next
                secondStart.next = temp
                secondStart = temp2
            firstStart = temp
            



