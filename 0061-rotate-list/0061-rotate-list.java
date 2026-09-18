class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode node = head;

        while (node != null) {
            node = node.next;
            length++;
        }

        int rotation = k % length;

        if (rotation == 0) return head;

        ListNode don = head;
        ListNode cock = new ListNode(0);

        for (int i = 1; i <= length; i++) {

            if (i == length - rotation) {
                cock.next = don;
            }

            if (i == length) {
                don.next = head;      // old tail → old head
                head = cock.next.next; // new head
                cock.next.next = null; // new tail → null
                break;
            }

            don = don.next;
        }

        return head;
    }
}