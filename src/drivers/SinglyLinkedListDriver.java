package drivers;

import linkedList.SinglyLinkedList;
import linkedList_Common.Node;

public class SinglyLinkedListDriver {

	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		// Test for empty list
		Node head = singlyLinkedList.getHead();
		System.out.println(head);

		// test using length
		int length = singlyLinkedList.getLength();
		System.out.println(length);
		System.out.println();

		// insert at beginning test
		System.out.println("insert at beginning test");
		singlyLinkedList.insertAtBegin(80);
		System.out.println(singlyLinkedList.getLength());
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// reinsert at beginning test
		System.out.println("reinsert at beginning test");
		singlyLinkedList.insertAtBegin(100);
		System.out.println(singlyLinkedList.getLength());
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// insertion at end
		System.out.println("insertion at end");
		singlyLinkedList.insertAtEnd(90);
		System.out.println(singlyLinkedList.getLength());
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// reinsertion at end
		System.out.println("reinsertion at end");
		singlyLinkedList.insertAtEnd(30);
		System.out.println(singlyLinkedList.getLength());
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// insertion at postion
		System.out.println("insertion at postion");
		singlyLinkedList.insertAtPosition(101, 3);
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// reinsertion at postion negative
		System.out.println("reinsertion at postion negative");
		singlyLinkedList.insertAtPosition(900, -1);
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// reinsertion at some extreme postion greater than linked list length
		System.out.println("reinsertion at some extreme postion greater than linked list length");
		singlyLinkedList.insertAtPosition(305, 10000000);
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// removing from beginning
		System.out.println("removing from beginning");
		singlyLinkedList.removeFromBegin();
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// remove from beginnin retest
		System.out.println("removing from beginning retest");
		singlyLinkedList.removeFromBegin();
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// remove from a position
		System.out.println("removing from position test");
		singlyLinkedList.removeFromPosition(2);
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// remove from a position extreme expected error
		try {
			System.out.println("removing from extreme position test, expected ERROR");
			singlyLinkedList.removeFromPosition(10000);
			System.out.println(singlyLinkedList.printSinglyLinkedList());
			System.out.println();
		} catch (Exception e) {
			System.err.println("cannot be removed from a postion which is not there , list too short");
		}

		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// remove from a negative position test
		System.out.println("removing from negative postion test, first element to be removed by default");
		singlyLinkedList.removeFromPosition(-100);
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// removing from last position test
		System.out.println("removing from last postion test");
		singlyLinkedList.removeFromEnd();
		System.out.println(singlyLinkedList.printSinglyLinkedList());
		System.out.println();

		// basic operation for linked list check for even
		System.out.println("linked list check for even");
		boolean checkEven = singlyLinkedList.checkEven();
		System.out.println(checkEven ? "even" : "odd");
	}
}
