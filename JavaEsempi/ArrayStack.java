import javax.management.RuntimeErrorException;

//Stack => Pila
public class ArrayStack<E> implements Stack<E> {

	private Object array[];
	private int n;//numero di elementi inseriti nello stack
	public ArrayStack(int capacity) 
	{	array = new Object[capacity];
		n=0;
	}
	
	public ArrayStack()
	{	this(100);	}

	public boolean isEmpty()
	{	return n==0;	}
	
	public void push(E element) //inserimento
	{	if(n==array.length)
			throw new RuntimeErrorException(null, "The stack is full!");
		array[n]=element;
		n++;
	}

	public E pop() {
		if(isEmpty())
			throw new RuntimeErrorException(null, "The stack is empty!");
		n--;
		return (E)array[n];
	}

	public E top() {
		if(isEmpty())
			throw new RuntimeErrorException(null, "The stack is empty!");
		return (E)array[n-1];
	}

}
