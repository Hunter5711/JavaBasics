	public class LinkList{
	
	private ListNode1 head;
	
	
	LinkList(ListNode1 head){
		this.head=head;
	}
	
	public ListNode1 getHead(){
		return head;
	}
	
	
	public int getLength(){
		ListNode1 currentNode=head;
		int length=1;
		while(currentNode.nextNode!=null){
			currentNode=currentNode.nextNode;
			length++;
		}
		return length;
	}
	
	public void addAtBeginning(ListNode1 node){
		node.nextNode=head;
		head=node;		
	}
	
	public void addAtEnd(ListNode1 node){
		ListNode1 currentNode=head;
		while(currentNode.nextNode!=null){
			currentNode=currentNode.nextNode;
		}		
		currentNode.nextNode=node;		
	}
	
	
	
}