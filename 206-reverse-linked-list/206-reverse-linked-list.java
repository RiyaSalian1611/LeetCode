/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        /** ITERATIVE AND RECURSIVE
            1. ITERATIVE
        */
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode ln = head;
        ListNode dummyHead = new ListNode(0);
        ListNode result = dummyHead;
        
        while(ln!=null){
            s.push(new ListNode(ln.val));
            ln = ln.next;
        }
        while(!s.isEmpty()){
            result.next = s.pop();
            result = result.next;
        }
        return dummyHead.next;
    }
}