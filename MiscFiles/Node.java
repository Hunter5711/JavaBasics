	public class Node {
	public Node nextNode;
	String title;
	public Node(String title) {
		this.title=title;
		
	}
	public Node getNextNode() {
		
		return nextNode;
	}
	public void setNextNode (Node nextNode) {
		this.nextNode=nextNode;
	}
	}