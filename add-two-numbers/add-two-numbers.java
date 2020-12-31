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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //edge case
        if(l1 == null && l2 == null){
            return new ListNode();
        }
        
        if(l2 == null){
            return l1;
        }
        
        if(l1 == null){
            return l2;
        }
        
        
        //logic
        ListNode result = new ListNode(-1);
        ListNode dummyhead = result;
        int carry = 0;
        
        while(l1 != null && l2 != null){
            int temp = l1.val + l2.val;
            
            if(carry == 1)
                temp++;
            
            if(temp > 9){
                carry = 1;
                result.next = new ListNode(temp % 10);
            }else{
