
public class Node {
    private Language data;
    private Node link;
    
    public Node() {
    	this(null);
    }
    public Node(Language data) {
    	this(data,null);
    }
	public Node(Language data, Node link) {
		super();
		this.data = data;
		this.link = link;
	}
	public Language getData() {
		return data;
	}
	public void setData(Language data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + 
	   (link == null ? "null" : "not null")
	+ "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
    
    

}
