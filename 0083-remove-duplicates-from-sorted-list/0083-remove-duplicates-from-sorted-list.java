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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode meow = head;
        if(meow == null){
            return head;
        }
        while(meow != null){
            if(meow.next != null && meow.val == meow.next.val){
                meow.next = meow.next.next;
            }else{
                meow = meow.next;
            }
                
            
        }
        return head;
    }
}