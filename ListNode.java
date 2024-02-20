public class ListNode {
    private Object nextItem; 
    private ListNode nextNode;

    public ListNode(Object item, ListNode node) {
        nextItem = item;
        nextNode = node;
    }

    public Object getItem(Object item) {
        return nextItem;
    }

    public void setNewNode(ListNode node) {
        nextNode = node;
    }
}
