/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        solveit(head);
        return head;
    }
    public Node solveit(Node head ){
        Node curr = head;
        Node last = head;
        while(curr != null){
            Node next = curr.next;
            if(curr.child != null){
                Node child = curr.child;
                curr.next = child;
                curr.child = null;
                child.prev = curr;
                Node childLast = solveit(child);
                childLast.next = next;
                if(next != null){
                    next.prev = childLast;
                }
                last = childLast;
            }else {
                last = curr;
            }
            curr = next;
        }
        return last;
    }
}