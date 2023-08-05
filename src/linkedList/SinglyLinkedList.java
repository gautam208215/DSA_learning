package linkedList;

import java.util.ArrayList;
import java.util.List;

import linkedList_Common.Node;

public class SinglyLinkedList {

	private Node head;
	private int length;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// singly linked list common operations

	// insert at the beginning
	public void insertAtBegin(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			head.setNext(null);
		} else {
			Node temp = head;
			node.setNext(temp);
			head = node;
		}
		length++;

	}

	// insert at end
	public void insertAtEnd(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		length++;
	}

	// insert at position
	public void insertAtPosition(int data, int position) {
		Node node = new Node(data);

		if (position < 1) {
			position = 1;
		}

		if (position > length) {
			position = length + 1;
		}

		if (head == null) {
			head = node;
		} else if (position == 1) {
			node.setNext(head);
			head = node;
		} else {
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
		length++;
	}

	// remove from beginnig
	public Node removeFromBegin() {
		if (head == null) {
			return null;
		} else {
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
			return temp;
		}
	}

	// remove from end
	public Node removeFromEnd() {
		if (head == null) {
			return null;
		} else if (head.getNext() == null) {
			head = null;
			return head;
		} else {
			Node prev = null;
			Node current = head;
			while (current.getNext() != null) {
				prev = current;
				current = current.getNext();
			}
			prev.setNext(null);
			return current;
		}
	}

	// remove from a position
	public void removeFromPosition(int position) {
		if (position == 1 || position < 1) {
			head = head.getNext();
		} else {
			Node current = head;
			for (int i = 1; i < position - 1; i++) {
//				System.out.println("current" + current);
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}

	}

	public int getLength() {
		int length = 0;
		Node start = head;

		if (head != null) {
			while (start != null) {
				length++;
				start = start.getNext();
			}
			return length;
		}

		return 0;
	}

	public boolean checkEven() {
		while (head != null && head.getNext() != null) {
			head = head.getNext().getNext();
		}

		if (head == null) {
			return true;
		}
		return false;
	}

	public List<Integer> printSinglyLinkedList() {
		List<Integer> linkedListElements = new ArrayList<>();
		Node temp = this.head;
		while (temp != null) {
			linkedListElements.add(temp.getData());
			temp = temp.getNext();
		}
		return linkedListElements;
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + ", length=" + length + "]";
	}

}
