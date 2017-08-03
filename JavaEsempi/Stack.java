
public interface Stack<E> {
	boolean isEmpty();
	void push(E element); //inserimento
	E pop();	//prelevamento
	E top();	//mostra quello che dovrebbe essere prelevato senza prelevarlo
}
