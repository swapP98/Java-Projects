public class DoubleLinkedList<E> implements List<E>{

	DNode<E> first, last;
	//private int length;
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
		first = null;
		last = null;
	}
	
	/*public int sizeLength() {
		return length;
	}
	 */
	public DNode<E> nodeAt(int index) {
		DNode<E> n;
		int i;
		if(index<0 || index >=size())
			throw new IndexOutOfBoundsException();
		if(index*2<size())
		{
			n=first;
			for(i=0; i<index; i++)
				n=n.next;
			return n;
		}		
		n=last;
		for(i=size()-1; i>index; i--)
			n=n.prev;
		return n;
	}

	public E get(int index) 
	{	return nodeAt(index).element;	}

	public E set(int index, E element) 
	{	DNode<E> temp = nodeAt(index);
		E oldElement = temp.element;
		temp.element=element;
		return oldElement;
	}

	public int size() 
	{	DNode<E> node = first;
		int count;
		for(count=0; node!=null; count++)
				node=node.next;
		return count;
	}

	public boolean add(E element) 
	{	if(last!=null)
		{	DNode<E> temp = new DNode<>(element, last, null);
			last.next=temp; 		//il last è quello prima
			last=temp;				//addesso il nuovo last è diventato temp
			return true;
		}
		else first = new DNode<E>(element, null, null);
			last=first;
		return true;
	}

	public void add(int index, E element) {
	// TODO Auto-generated method stub
		if(index==0)
		{	first = new DNode(element, null, first);
			if(first.next==null)
				last=first;
			else 
				first.next.prev=first;
		}
		
		DNode p = nodeAt(index-1); //precedente p;
		DNode s = p.next; //s=succesivo
		//p.next= new DNode(element, p, s); //oppure
		DNode n = new DNode(element, p, s);
		p.next=n;
		if(s!=null)
			s.prev=n;
		else last=n;
	}

	public E remove(int index) {
		if(index==0)
		{
			E e = first.element;
			first = first.next;
			first.prev=null;
			return e;
		}
		DNode p = nodeAt(index-1); //precedente p;
		DNode n = p.next; //s=succesivo
		p.next=n.next;
		if(n.next!=null)
			n.next.prev=p;
		else last=p;
		return (E) n.element;
	}
	
	public static void main(String[] args)
	{
		DoubleLinkedList<String> s = new DoubleLinkedList<>();
		s.add("fjdn");
		s.add("kjasdn");
		s.add("djan");
		s.add("djanjkbb");
		s.add("djjknkan");
		s.remove(2);
		
		System.out.println(s.get(2));
	}

}
