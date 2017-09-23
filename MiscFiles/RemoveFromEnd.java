	public class  Remove {
		public removeFromEnd () {
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
		System.out.pprintln ("Removed node is" +removeNode.gettitle () );
		System.out.pprintln ();
		list.displayElements ();
		
		}
		
		
		
	}