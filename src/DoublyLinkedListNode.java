
public class DoublyLinkedListNode {
	 protected int data;
	    protected DoublyLinkedListNode next, prev;
	 
	    public DoublyLinkedListNode() {
	        next = null;
	        prev = null;
	        data = 0;
	    }
	 
	    public DoublyLinkedListNode(int d, DoublyLinkedListNode n, DoublyLinkedListNode p) {
	        data = d;
	        next = n;
	        prev = p;
	    }
	 
	    public void setLinkNext(DoublyLinkedListNode n) {
	        next = n;
	    }
	 
	    public void setLinkPrev(DoublyLinkedListNode p) {
	        prev = p;
	    }
	 
	    public DoublyLinkedListNode getLinkNext() {
	        return next;
	    }
	 
	    public DoublyLinkedListNode getLinkPrev() {
	        return prev;
	    }
	 
	    public void setData(int d) {
	        data = d;
	    }
	 
	    public int getData() {
	        return data;
	    }
}
