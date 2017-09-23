	public class LinkList {
	Node head;
	LinkList (Node head){
	this.head =head;
	}
	public void insert( Node node ,int position) {
		Node currentNode =head;
		Node previousNode = null;
		for(int i=0;i<position;i++)
		previousNode=currentNode;
		currentNode=currentNode.getNextNode();
		
	}
	public static LinkList createList(int elementCount)
	{
		Node previousNode =null;
		Node head =null;
		for(int i=1; i< elementCount;i++) {
			Node node =new Node ( "node " + i);
			if (previousNode != null) {
			previousNode.setNextNode (node);
					
				}
				else {
					head=node;
					
				}
				previousNode=node;
				
		}
		LinkList list = new LinkList(head);
		return list  ;
	}
	public void displayElements() {
		Node currentNode =head;
		while (currentNode.getNextNode() !=null ); {
			System.out.println(currentNode.title);
			currentNode=currentNode.getNextNode();
		}
		System.out.println(currentNode.title);
		
	}
	
	public static void main (String [] args ) {
		LinkList list = createList(15);
		Node node11=new Node (" node 11");
		list.insert (node11 ,10);
		list.displayElements();
		
	}
	}
	
	

