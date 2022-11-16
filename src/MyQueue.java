
public class MyQueue<E> {

	private LinkedList<E> queue;

	public MyQueue() {

		queue = new LinkedList<>();
	}

	public void push(E e) {
		queue.addFirst(e);
	}

	public E pop() {
		return queue.removeFirst();
	}

	public E peek() {
		return queue.getFirst();
	}

	public int getSize() {
		return queue.size();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
    @Override
	public String toString() {
		return queue.print();
	}

	public boolean contain(E e) {
		return queue.contain(e);
	}

	public E getElement(int i) {
		return queue.getElement(i);
	}

}
