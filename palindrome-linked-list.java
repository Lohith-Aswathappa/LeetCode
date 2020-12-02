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
    public boolean isPalindrome(ListNode head) {
        //edge case
        if(head == null){
            return true;
        }
        
        //logic
        int length = 0;
        ListNode curr = head;
        
        while(curr != null){
            curr = curr.next;
            length++;
        }
        
        ListNode prev = null;
        curr = head;
        boolean isEven = false;
