public class LinkListTest{
	
	public static void main(String[] args){
		
		ListNode1 node1= new ListNode1("node1");		
		ListNode1 node2= new ListNode1("node2");
		ListNode1 node3= new ListNode1("node3");
		ListNode1 node4= new ListNode1("node4");
		ListNode1 node5= new ListNode1("node5");
		
		node1.nextNode=node2;
		node2.nextNode=node3;
		node3.nextNode=node4;
		node4.nextNode=node5;
		
		ListNode1 node6= new ListNode1("node6");
		
		LinkList list=new LinkList(node1);
		
		System.out.println(list.getLength());
		
		list.addAtBeginning(node6);

		ListNode1 node7= new ListNode1("node7");		
//		adding node7 to end of list
		list.addAtEnd(node7);
		
		LinkListTest.displayListElements(list);	
		System.out.println(list.getLength());		
	}
	
	public static void displayListElements(LinkList list){		
		ListNode1 curentNode=list.getHead();
		
		while(curentNode.nextNode != null){
			System.out.println(curentNode.getTitle());
			curentNode = curentNode.nextNode;
		}
		System.out.println(curentNode.getTitle());
	}

}