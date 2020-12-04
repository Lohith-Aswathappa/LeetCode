/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //edge case
        if(head == null){
            return head;
        }
        
        //logic
        ListNode prev = null;
        
        while(head != null){
            ListNode tempNext = head.next;
            head.next = prev;
            prev = head;
            head = tempNext;
        }
        
        return prev;
    }
}
