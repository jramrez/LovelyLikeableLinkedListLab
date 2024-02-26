public class ListNode {
    private Object nodeItem; 
    private ListNode nextNode;

    public ListNode(Object item, ListNode next) {
        nodeItem = item;
        nextNode = next;
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

    public void setNewNode(ListNode node) {
        nextNode = node;
    }
}
