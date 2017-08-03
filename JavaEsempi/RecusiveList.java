
public class RecusiveList<E> implements List<E> {

	private E head;
	private RecusiveList<E> tail;
	public RecusiveList(E element) 
	{	head = element;
		tail=null;		
	}

	public E get(int index) {
		if(index==0)
			return head;
		return tail.get(index-1);
	}

	public E set(int index, E element) {
		if(index==0)
		{
			E temp = head;
			head = element;
			return temp;
		}
		return tail.set(index-1, element);
	}
	
	public int size() {
		if(tail==null)
			return 0;
		return 1 + tail.size();
	}

	public boolean add(E element) {
		if(tail==null)
		{
			tail = new RecusiveList<E>(element);
			return true;
		}
		return tail.add(element);
	}

	/*public void add(int index, E element) {
		if(tail==null)
		{
			RecusiveList<E> temp = tail;
			tail = new RecusiveList<E>(element);
			tail.tail = temp;
			head = element;
			return ;
		}
		return tail.add(index-1, element);
	}*/

	public E remove(int index) {
		if(tail==null)
		{
			E temp = head;
			head = tail.head;
			tail = tail.tail;
			return temp;
		}
		return remove(index-1);
	}
	
	public int IndexOf(E element)
	{	if(size()==0)
		return -1;
		if(head.equals(element))
			return 0;
		return 1+tail.IndexOf(element);	
	}
	
	public boolean remove(E element)
	{
		int temp;
		temp=IndexOf(element);
		if(temp==-1)
			return false;
		remove(temp);
		return true;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

}
