/**
 * Build a linked list of integers from 1 to 10
 * 
 * @author CS1027
 */
import java.io.*;

public class BuildLinkedList {

	/*
	 * Print the information stored in all the nodes of the list whose first node is
	 * referenced by front
	 */
	private static void printList(LinearNode<Integer> front) throws Exception {
		LinearNode<Integer> current = front;
		
		 BufferedReader keyboard=
		         new BufferedReader (new InputStreamReader(System.in),1);
		 
		 boolean done = false;
		 while (done == false) {
			
			 System.out.print("Enter an integer: ");
			 String userTyped = keyboard.readLine();
		 
			try {
				int value = Integer.parseInt(userTyped);
				for (int i = 1; i <= value; i++) {
					System.out.println(current.getElement());
					current = current.getNext();
				}
				done = true;
			} catch (Exception e) {
				System.out.print(e.getMessage());
				
			}
		}
	}

	public static void main(String[] args) throws Exception {

		// create a linked list that holds 1, 2, ..., 10
		// by starting at 10 and adding each node at head of list

		LinearNode<Integer> front = null; // create empty linked list
		LinearNode<Integer> intNode;

		for (int i = 20; i >= 1; i--) {
			// create a new node for i
			intNode = new LinearNode<Integer>(new Integer(i));
			// add it at the head of the linked list
			intNode.setNext(front);
			front = intNode;
		}

		printList(front);
	}

}