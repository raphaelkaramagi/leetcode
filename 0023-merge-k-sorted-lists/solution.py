# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

import heapq

class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        # For each linked List in lists, go through and add to minheap
        # Then pop from minheap in order to build return linkedlist

        heap = []

        for linkedList in lists:
            node = linkedList
            while(node is not None):
                heapq.heappush(heap,node.val)
                node = node.next

        dummy = ListNode(0)
        node = dummy
        while(heap):
            node.next = ListNode(heapq.heappop(heap))
            node = node.next

        return dummy.next
