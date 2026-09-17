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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        while(curr != null){
            ListNode newbie = curr.next;
            curr.next = head;
            if(curr == head){
                head.next = null;
            }
            head = curr;
            curr = newbie;
        }
        return head;

    }
}