
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
