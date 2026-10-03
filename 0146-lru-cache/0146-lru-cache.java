class LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> hmap = new HashMap<>();
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!hmap.containsKey(key)) {
            return -1;
        }

        Node curr = hmap.get(key);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        tail.prev.next = curr;
        curr.prev = tail.prev;
        curr.next = tail;
        tail.prev = curr;

        return curr.value;
    }

    public void put(int key, int value) {
        if (hmap.containsKey(key)) {
            Node curr = hmap.get(key);

            curr.value = value;

            // Remove from current position
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
            tail.prev.next = curr;
            curr.prev = tail.prev;
            curr.next = tail;
            tail.prev = curr;

            return;
        }

        Node newnode = new Node(key, value);

        tail.prev.next = newnode;
        newnode.prev = tail.prev;
        newnode.next = tail;
        tail.prev = newnode;

        hmap.put(key, newnode);
        if (hmap.size() > capacity) {
            Node lru = head.next;

            head.next = lru.next;
            lru.next.prev = head;

            hmap.remove(lru.key);
        }
    }
}