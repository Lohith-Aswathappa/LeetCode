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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode reversed = reverse(mid);
        
        while(reversed != null){
            if(head.val != reversed.val){
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        
        return true;
    }
    
    private ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.next;
    }
    
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
}