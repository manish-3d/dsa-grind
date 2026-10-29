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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head ;
        ListNode newhead = null;
        ListNode prev = null;
        while(fast != null){
            newhead = slow;
            slow = slow.next;
            fast = fast.next.next;
            newhead.next = prev;
            prev = newhead;
        }
        int maxi = Integer.MIN_VALUE;
        while(prev != null){
            maxi = Math.max(maxi,prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }
        return maxi;
    }
}