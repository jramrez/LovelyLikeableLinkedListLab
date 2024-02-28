public class ListNode {
    private Object nodeItem; 
    private ListNode nextNode;
    private ListNode prevNode;

    public ListNode(Object item, ListNode next) {
        nodeItem = item;
        nextNode = next;
    }

    public ListNode(Object item, ListNode next, ListNode previous) {
        nodeItem = item;
        nextNode = next;
        prevNode = previous;
    }

    public ListNode(Object item) {
        nodeItem = item;
    }

    public ListNode(ListNode next) {
        nextNode = next;
    }

    public Object getThisNode() {
        return nodeItem;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public ListNode getPrevNode() {
        return prevNode;
    }

    public void setNextNode(ListNode node) {
        nextNode = node;
    }

    public void setPrevNode(ListNode node) {
        prevNode = node;
    }
}
