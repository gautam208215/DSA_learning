package drivers;

import linkedList.CircularlyLinkedList;

public class CircularyLinkedLisrDriver {

	public static void main(String[] args) {

		CircularlyLinkedList circularlyLinkedList = new CircularlyLinkedList();
		circularlyLinkedList.display();

		circularlyLinkedList.insertFirst(100);
		circularlyLinkedList.display();

		System.out.println();
		circularlyLinkedList.insertFirst(800);
		circularlyLinkedList.display();

		System.out.println();

		circularlyLinkedList.insertLast(300);
		circularlyLinkedList.display();
		
		System.out.println();
		circularlyLinkedList.removeFirst();
		circularlyLinkedList.display();

	}

}
