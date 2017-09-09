public class ListNode1{
	
	int data;
	ListNode1 nextNode;
	
	
	public int getLength(){
		ListNode1 currentNode;
		int length=0;
		currentNode=this;
		while(currentNode.nextNode!=null){
			currentNode=currentNode.nextNode;
			length++;
		}
		return length;
		
	}
	
	public static void main(String[] args){
		
		ListNode1 node1= new ListNode1();		
		ListNode1 node2= new ListNode1();
		ListNode1 node3= new ListNode1();
		ListNode1 node4= new ListNode1();
		ListNode1 node5= new ListNode1();
		
		node1.nextNode=node2;
		node2.nextNode=node3;
		node3.nextNode=node4;
		node4.nextNode=node5;
		
		System.out.println(node2.getLength());
	
		
	}
	
	
	
	
	
}