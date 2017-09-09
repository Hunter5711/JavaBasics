		import java.p1.Node ;
		import java.p1.LinkList;
		
		
		
		public class  Remove {
		public ListNode removeFromEnd () {
		Node currentNode =head ;
		Node previousNode =currentNode;
		currentNode=null;
		while (currentNode.nextNode !=null)
		{
			
			previousNode=currentNode;
			currentNode=currentNode.nextNode ;
		}
		previousNode.nextNode=null ;
		return currentNode;
		}
		public static void main (String [] args) {
		Node removeNode =list.removeFromEnd( ) ;
		System.out.println ("Removed node is" +removeNode.gettitle () );
		System.out.println ();
		list.displayElements ();
		
		}
		
		
		
	}