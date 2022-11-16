
public class LinkedList<E> {

	public Node<E> head;
	public Node<E> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addFirst(E value) {
		Node node = new Node(value, head);
		if (head == null) {
			tail = node;
		}
		head = node;
	}

	public void addLast(E value) {
		Node node = new Node(value, null);
		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}

	public E removeFirst() {
		if (head == null) {
			return null;
		}
		E e = head.data;
		head = head.next;
		return e;

	}

	public E removeLast() {
		if (head == null) {
			return null;
		}

		if (head.next == null) {
			E e = head.data;
			head = null;
			tail = null;
			return e;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		E e = tail.data;
		tail = temp;
		tail.next = null;
		return e;
	}

	public int size() {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}

	public String print() {
		Node temp = head;
		String s = "";
		while (temp != null) {
			s += temp.data;
			temp = temp.next;
		}
		return s;
	}

	public E getFirst() {
		if (head != null) {
			return head.data;
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	
	public E getElement(int i) {
		Node temp = head;
		int counter = 0;
		while(temp != null) {
			if(counter == i) {
				return (E) temp.data;
			}
			counter++;
			temp = temp.next;
		}
		return null ;
	}
	public boolean contain(E e){
		 Node<E> temp = head;
		
		 while(temp != null){
		 if(temp.data == e){
		 return true;
		 }
		 temp = temp.next;
		 }
		
		 return false;
		 }
	

}
