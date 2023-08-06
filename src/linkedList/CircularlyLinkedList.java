package linkedList;

import java.util.NoSuchElementException;

import linkedList_Common.Node;

public class CircularlyLinkedList {


	private Node last;
	private int length;

	public CircularlyLinkedList() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void display() {
		if (last == null) {
			return;
		}

		Node first = last.getNext();
		while (first != last) {
			System.out.print(first.getData() + " ");
			first = first.getNext();
		}

		System.out.print(first.getData());

	}

	public void insertFirst(int data) {
		Node temp = new Node(data);
		if (last == null) {
			last = temp;
		} else {
			temp.setNext(last.getNext());
		}
		last.setNext(temp);
		length++;
	}

	public void insertLast(int data) {
		Node temp = new Node(data);
		if (last == null) {
			last = temp;
			last.setNext(temp);
		} else {
			temp.setNext(last.getNext());
			last.setNext(temp);
			last = temp;
		}
		length++;
	}

	public Node removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("doesn't contain any element");
		}

		Node temp = last.getNext();
		if (last.getNext() == last) {
			last = null;
		} else {
			last.setNext(temp.getNext());
		}
		temp.setNext(null);
		length--;
		return temp;
	}



}
