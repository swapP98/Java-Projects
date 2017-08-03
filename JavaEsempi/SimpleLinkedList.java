
public class SimpleLinkedList<E> implements List<E> {

	Node<E> first;
	public SimpleLinkedList() 
	{	first=null;	}

	public Node<E> nodeAt(int index) {//Restituisce il nodo del indice index
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		Node<E> n = first;
		for(int i=0; i<index; i++)
			n=n.next;
		return n;
	}
	
	public E get(int index) 
	{	return nodeAt(index).element;	}

	public E set(int index, E element) {
		E oldElement = nodeAt(index).element;
			nodeAt(index).element = element;
		return oldElement;
	}

	public int size() {
		int count=0;
		for(Node<E> n=first; n!=null; n=n.next)
			count++;
		return count;
	}

	public boolean add(E element) {
		add(size(), element);
		return true;
	}

	public void add(int index, E element) {
		if(index==0)
			first = new Node<E>(element, first);
		else {
			Node<E> temp = nodeAt(index-1);
			temp.next = new Node<E>(element, temp.next);
		}
	}

	public E remove(int index) {
		E element = get(index);
		if(index==0)
			first = first.next; //nodeAt(0).next;
		else nodeAt(index-1).next = nodeAt(index).next;
		return element;
	}
	
	public void swap(int i, int j) {
		set(i,set(j,get(i)));
	}
	
	public int indexOf(E element)
	{	//Restituisce l'indice del elemtento esistente nella lista
		for(int i=0; i<size(); i++)
		if(element.equals(get(i)))
			return i;
		return -1;
	}

	public boolean remove(E element)
	{
		int i;
		i=indexOf(element);
		if(i<0)
			return false;
		remove(i);
		return true;
	}
	
	public static void main(String[] args)
	{
		SimpleLinkedList<String> s = new SimpleLinkedList<>();
		s.add("fjdn");
		s.add("kjasdn");
		s.add("djan");
		s.add("djanjkbb");
		s.add("djjknkan");
		s.remove("djan");
		
		System.out.println(s.get(3));
	}
}
