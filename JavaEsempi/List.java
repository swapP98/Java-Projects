
public interface List<E> {
	E get(int index);
	E set( int index, E element);
	int size();
	boolean add(E element);
	void add(int index, E element);
	E remove(int index);
}
