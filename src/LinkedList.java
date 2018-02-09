
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
	
	public Language deleteFromBack() {
		Language lang = null;
		if(isEmpty()) {
			System.out.println(
					"List is empty");
		}else {
			//check if only one element in list
            if(head.getLink()==null) {
            	lang = head.getData();
            	//delete head; <-- C++
            	head = null;
            }else {
    			Node prev = head;
    			Node current = head;
    			while(current.getLink() != null) {
    				prev = current;
    				current = current.getLink();
    			}
    			prev.setLink(null);
    			lang = current.getData(); //get data before deleting
    			current = null;//delete current;            	
            }
		}
		return lang;
	}
	
	public void insertAtFront(Language lang) {
		if(isFull()) {
			System.out.println("List is full");
		}else {
			Node temp = new Node(lang);
			if(isEmpty()) {
				head = temp;
			}else {
				//let new node link to the current beginning of list
				temp.setLink(head);
				//let head store the address of the new node
				head = temp;
			}
		}
	}
	
	public Language deleteFromFront() {
		Language lang = null;
		if(isEmpty()) {
			System.out.println(
					"List is empty");
		}else {
			Node current = head;
			head = current.getLink();
			lang = current.getData();
			current = null;//delete current; <-- c++
		}
		return lang;
	}
	
	
	public void destroy() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			Node prev = head;
			Node current = head;
			while(current != null) {
				prev = current;
				current = current.getLink();
				prev = null;// delete prev <-- C++
			}
			head = null;
		}
	}

}
