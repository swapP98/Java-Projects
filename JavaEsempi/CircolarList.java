public class CircolarList<E> implements List<E> {
	private DNode<E> sentinel;
	private int length;
	public CircolarList() {
		length=0;
		sentinel = new DNode(null, null, null);
		sentinel.next=sentinel.prev=sentinel;
	}

	public DNode<E> nodeAt(int index)
	{
		DNode<E> n;
		int i;
		if(index<0 || index>=length)
			throw new IndexOutOfBoundsException();
		if(index*2<size())
		{
			n=sentinel;
			for(i=0; i<index; i++)
				n=n.next;
			return n;
		}		
		n=sentinel;
		for(i=size()-1; i>index; i--)
			n=n.prev;
		return n;
	}
	public E get(int index) {
		return nodeAt(index).element;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean add(E element) 
	{	if(sentinel!=null)
		{	DNode<E> temp = new DNode<>(element, sentinel, null);
			sentinel.next=temp; 		//il last è quello prima
			sentinel=temp;				//addesso il nuovo last è diventato temp
			return true;
		}
		else sentinel = new DNode<E>(element, null, null);
		sentinel=sentinel;
		return true;
	}

	public void add(int index, E element) {
	// TODO Auto-generated method stub
		if(index==0)
		{	sentinel = new DNode(element, null, sentinel);
			if(sentinel.next==null)
				sentinel=sentinel;
			else 
				sentinel.next.prev=sentinel;
		}
		
		DNode p = nodeAt(index-1); //precedente p;
		DNode s = p.next; //s=succesivo
		//p.next= new DNode(element, p, s); //oppure
		DNode n = new DNode(element, p, s);
		p.next=n;
		if(s!=null)
			s.prev=n;
		else sentinel=n;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args)
	{
		CircolarList<String> s = new CircolarList<>();
		s.add("fjdn");
		s.add("kjasdn");
		s.add("djan");
		s.add("djanjkbb");
		s.add("djjknkan");
		
		System.out.println(s.get(2));
	}
}
