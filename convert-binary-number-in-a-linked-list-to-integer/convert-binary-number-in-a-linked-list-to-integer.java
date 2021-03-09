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
    public int getDecimalValue(ListNode head) {
        //edge case
        if(head == null){
            return 0;
        }
        //logic
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(head != null){
            res.add(head.val);
            head = head.next;
        }
        
        // System.out.print(res);
        int j = 0;
        int result = 0;
        
        for(int i = res.size()-1; i >= 0; i--){
            if(res.get(i) == 1){
                result += Math.pow(2, j);
            }
            j++;
        }
        
        return result;
    }
}