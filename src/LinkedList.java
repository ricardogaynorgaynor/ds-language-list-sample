
public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public Node getHead() {
		return head;
	}
	
	public boolean isEmpty() {
//		return head == null;
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			temp = null; //delete temp; <-- C++
			return false;
		}
	}
	
	public void insertAtBack(Language lang) {
		if(isFull()) {
			System.out.println(
					"Unable to insert node into full list");
		}else {
			Node temp = new Node(lang);
			if(isEmpty()) {
				head = temp;
			}else {
				Node current = head;
				while(current.getLink() != null) {
					current = current.getLink();
				}
				current.setLink(temp);
			}
		}
		
		
	}

}