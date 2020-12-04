/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //edge case
        if(node == null){
            return;
        }
        
        //logic
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
