public class DNode<E> {	
	public E element;
	public DNode<E> prev, next;
	public DNode(E element, DNode<E> prev, DNode<E> next) {
		// TODO Auto-generated constructor stub
		this.element = element;
		this.prev = prev;
		this.next = next;
	}

}
