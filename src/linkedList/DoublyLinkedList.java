package linkedList;

import linkedList_Common.Node;

public class DoublyLinkedList {

	private int length;
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		this.length = 0;
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public void displayForward() {
		if (head == null) {
			System.out.println("null");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}

		System.out.println("null");
	}

	public void displayBackwards() {
		if (tail == null) {
			System.out.println("null");
			return;
		}
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getPrev();
		}
		System.out.println("null");
	}

// insert at beginning
	public void insertFirst(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			tail = node;
		} else {
			head.setPrev(node);
		}
		node.setNext(head);
		head = node;
		length++;

	}

// insert at end
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
		}
		node.setPrev(tail);
		tail = node;
		length++;

	}

// insert node at position

	public void insertAtPostion(int data, int position) {
		Node node = new Node(data);

		if (position < 1) {
			position = 1;
		}

		if (position > length) {
			position = length + 1;
		}

		if (head == null) {
			head = node;
			tail = node;
		} else if (position > length) {
			node.setPrev(tail);
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else if (position == 1) {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		} else {
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			}
			node.setPrev(temp);
			node.setNext(temp.getNext());
			node.getNext().setPrev(node);
			temp.setNext(node);
		}

		length++;
	}

// remove from first position
	public void removeFirst() {

		if (head == null) {
			System.out.println("here in head == null");
			return;
		}

		Node temp = head;
		if (head == tail) {
			System.out.println("here in head == tail");
			tail = null;
		} else {
			head.getNext().setPrev(null);
		}
		head = head.getNext();
		temp.setNext(null);
		length--;
	}

// remove from last
	public void removeLast() {
		if (tail == null) {
			System.out.println("enetreed here tail == null");
			return;
		}

		Node node = tail;
		if (head == tail) {
			System.out.println("eneter head == tail");
			System.out.println();
			head = null;
		} else {
			System.out.println("enetered at else part");
			tail.getPrev().setNext(null);
		}

		tail = tail.getPrev();
		node.setPrev(null);
		length--;
	}

// remove from a position
	public void removeFromPosition(int position) {

		if (position > length) {
			position = length + 1;
		}

		if (position < 1) {
			position = 1;
		}

		if (head == null) {
			return;
		} else if (position == 1) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			} else {
				head.setPrev(null);
			}
		} else {
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			temp.getNext().setPrev(temp);
		}
		length--;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}
