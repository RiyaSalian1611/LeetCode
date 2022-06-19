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
    
    ListNode dummyHead = new ListNode(0);
        ListNode prev_list = dummyHead.next;
        int counter = 0;
    
    public ListNode reverseList(ListNode l1) {
        /** ITERATIVE AND RECURSIVE */
        
    /*********ITERATIVE***************
    /** l1 is head ****
    
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode ln = l1;
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
    */
        
    /********RECURSIVE*************/
            
            if(l1==null) return prev_list;           
            ListNode newNode = new ListNode(l1.val);
            newNode.next = prev_list;
            prev_list = newNode;
            l1 = l1.next;
            reverseList(l1);   
        return prev_list;
    }
}