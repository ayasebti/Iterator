
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListNode c = new DoublyLinkedListNode();
		DoublyLinkedListNode b = new DoublyLinkedListNode();
		
		
		DoublyLinkedListNode aa = new DoublyLinkedListNode(0,c,b);
		b.setData(1);
		c.setData(2);
		aa.getData();
		b.getData();
		aa.getData();

	}

}
