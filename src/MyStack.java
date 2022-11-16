
public class MyStack<E> {
	LinkedList<E> stack = new LinkedList<E>();
	public void push(E o) {
		stack.addFirst(o);
	}
	public E pop() {
		return stack.removeFirst();
	}
	public E peek() {
		
		return  stack.getFirst(); 
	}
	public int getSize() {
		return stack.size();
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public String toString() {
		return stack.print();
	}
	public boolean contains(E o) {
		return stack.equals(o);
	}
	public E getElement(int i) {
		return stack.getElement(i);
	}
	



}
