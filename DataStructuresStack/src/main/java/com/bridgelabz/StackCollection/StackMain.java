package com.bridgelabz.StackCollection;

import java.util.Scanner;
/* create a Stack of
* 56->30->70 and perform 
* stack operations */

public class StackMain {
	static Scanner scanner = new Scanner(System.in);
	
	//program menu selection 
	private static int userMenu() {
		System.out.println("\nPlease enter your choice.");
		System.out.println("Press 1 to Insert");
		System.out.println("Press 2 to Peek");
		System.out.println("Press 3 to Exit.");
		int choice = scanner.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		//creating stack object to call stack functions
		StackImplementation stack = new StackImplementation();
		boolean flag = true;
		while(flag) {
			int choice = userMenu();
			switch(choice) {
				case 1:	System.out.println("\nEnter the element to insert to stack :");
						int element = scanner.nextInt();
						stack.push(element);
						System.out.println("\nElement "+element+" is pushed into stack.");
						break;
				case 2: System.out.println("\nElements of Stack are :");
						stack.display();
						break;
				case 3: System.out.println("\nExiting from Stack,Thanks");
						flag = false;
						break;
				default:System.out.println("\nInvaid choice.");
			}

		}

	}
}