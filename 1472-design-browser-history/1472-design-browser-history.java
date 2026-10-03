class BrowserHistory {
    class Node{
        Node next;
        Node prev;
        String val;
    public Node(String val){
        this.val = val;
    }
    }
     Node head;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        head.next = null;
        head.prev = null;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        head.next = newNode;
        newNode.prev = head;
        head = newNode;
    }
    
    public String back(int steps) {
        Node curr = head;
        while(curr.prev != null && steps > 0){
            curr = curr.prev;
            steps--;
        }
        head = curr;
        return head.val;
    }
    
    public String forward(int steps) {
        Node curr = head ;
        while(curr.next != null && steps > 0){
            curr = curr.next;
            steps--;
        }
        head = curr;
        return head.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */