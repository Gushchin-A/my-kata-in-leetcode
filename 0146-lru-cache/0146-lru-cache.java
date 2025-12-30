class LRUCache {

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }

        remove(node);
        addToTail(node);

        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);

        if (node != null) {
            node.value = value;
            remove(node);
            addToTail(node);
        } else {
            if (map.size() == capacity) {
                Node eldest = head.next;
                remove(eldest);
                map.remove(eldest.key);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            addToTail(newNode);
            map.put(key, newNode);

        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToTail(Node node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */