/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //edge case
        
        //logic
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        while(nodeA != nodeB ){
            
//             if(nodeA == nodeB){
//                 return nodeA;
//             }
            
            if(nodeA != null){
                nodeA = nodeA.next;;
            }else{
                nodeA = headB;
            }
            
            if(nodeB != null){
                nodeB = nodeB.next;
            }else{
                nodeB = headA;
            }
            
            // nodeA = nodeA.next;
            // nodeB = nodeB.next;
        }
        
        return nodeA;
    }
}
