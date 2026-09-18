class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        while (i != null && j != null) {
            if (i.val > j.val) {
                dummy.next = j;
                dummy = j;
                j = j.next;
            } else {
                dummy.next = i;
                dummy = i;
                i = i.next;
            }
        }

        dummy.next = (i != null) ? i : j;

        return ans.next;
    }
}