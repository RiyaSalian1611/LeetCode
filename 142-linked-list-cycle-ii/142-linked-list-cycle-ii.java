/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while(head!=null){
            if(hs.contains(head.next)){
                return head.next;
            }
            hs.add(head);
            head = head.next;
        }
        return head;
    }
}