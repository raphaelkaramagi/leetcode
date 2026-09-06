# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if(list1 is None):
            return list2
        elif(list2 is None):
            return list1

        output = ListNode()
        dummy = output

        l1 = list1
        l2 = list2
        while(l1 != None or l2!=None):
            if(l1!=None and l2!=None):
                if l1.val <= l2.val:
                    output.next = ListNode(l1.val)
                    output = output.next
                    l1=l1.next
                else:
                    output.next = ListNode(l2.val)
                    output = output.next
                    l2=l2.next
            elif(l1 is None):
                while(l2 is not None):
                    output.next = ListNode(l2.val)
                    output = output.next
                    l2=l2.next
            else:
                while(l1 is not None):
                    output.next = ListNode(l1.val)
                    output = output.next
                    l1=l1.next

        return dummy.next
            
        
                    

        



