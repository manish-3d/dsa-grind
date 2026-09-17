class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode ans = new ListNode();
        ListNode anshead = ans;

        ListNode head1 = l1;
        ListNode head2 = l2;

        int sum = 0;

        while (head1 != null && head2 != null) {
            sum = head1.val + head2.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            ans.next = new ListNode(sum);
            ans = ans.next;

            head1 = head1.next;
            head2 = head2.next;
        }

        while (head1 != null) {
            sum = head1.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            ans.next = new ListNode(sum);
            ans = ans.next;

            head1 = head1.next;
        }

        while (head2 != null) {
            sum = head2.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            ans.next = new ListNode(sum);
            ans = ans.next;

            head2 = head2.next;
        }

        if (carry == 1) {
            ans.next = new ListNode(1);
        }

        return anshead.next;
    }
}