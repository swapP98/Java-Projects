package gestionelista;

/**
 * @author Paul Swapnil
 */
public class SimpleLinkedQueue {

	public class Node
	{
		public String element;
		public Node next;
		public Node(String element, Node next)
		{
			this.element = element;
			this.next = next;
		}
	}
	
	public Node  first, last;
	public SimpleLinkedQueue()
	{
		first = last = null;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void add(String element)
	{
		if(isEmpty())
		{
			first = last = new Node(element,null);
			return ;
		}

		last = last.next=new Node(element,null);
	}
	public String toString()
	{
		String s="";
		for(Node n=first; n!=null; n = n.next)
		{
			s = s + n.element+", ";
		}
		
		return s;
	}
	
}
