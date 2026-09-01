# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head==None):
            return None
        prev = None
        while(head!=None):
            curr = head
            head = head.next
            curr.next = prev
            prev = curr

        return prev
            

