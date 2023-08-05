package drivers;

import linkedList.DoublyLinkedList;

public class DoublyLinkedListDriver {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.insertAtPostion(10, 100);
		doublyLinkedList.insertAtPostion(20, 100);
		doublyLinkedList.insertAtPostion(50, 2);
		doublyLinkedList.insertAtPostion(890, 3);

		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();

		doublyLinkedList.removeFromPosition(-1);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();

		doublyLinkedList.insertAtPostion(20, -1);
		doublyLinkedList.insertFirst(30);
		doublyLinkedList.insertAtPostion(40, 0);
		doublyLinkedList.insertAtEnd(50);
		System.out.println(doublyLinkedList.length());
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();

		System.out.println("--------------------------");
		doublyLinkedList.insertAtPostion(60, 3);

		doublyLinkedList.insertFirst(10);
		doublyLinkedList.insertAtEnd(20);

		doublyLinkedList.insertFirst(50);
		doublyLinkedList.insertAtEnd(80);

		System.out.println(doublyLinkedList.length());
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();

		System.out.println("---------------------");

		doublyLinkedList.removeLast();

		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();

		System.out.println(doublyLinkedList.length());
		System.out.println("---------------------");

		doublyLinkedList.removeLast();
		System.out.println(doublyLinkedList.length());

		System.out.println("----------------------");
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackwards();
		System.out.println("----------------------");

	}

}
