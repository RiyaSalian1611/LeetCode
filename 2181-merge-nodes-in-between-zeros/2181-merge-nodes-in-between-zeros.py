# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        head = head.next
        dummy_head = head
        
        while dummy_head is not None and dummy_head.next is not None:
            
            while dummy_head.next.val != 0 and dummy_head.val != 0:
                dummy_head.val = dummy_head.val + dummy_head.next.val 
                dummy_head.next = dummy_head.next.next
            
            if dummy_head.next.val == 0:
                dummy_head.next = dummy_head.next.next
            
            dummy_head = dummy_head.next
       
        return head
                