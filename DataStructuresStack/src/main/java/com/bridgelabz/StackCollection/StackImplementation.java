package com.bridgelabz.StackCollection;


public class StackImplementation {

	private Node top;
	
	public StackImplementation() {
		this.top = top;
	}
	
	//method to push elements into stack
	void push(int element) {
		Node node = new Node();
		node.data= element;
		if(node==null)
			node.next=null;
		else {
			node.next=top;
			top=node;
		}
	}
	
	//method to display elements of stack
	void display() {
		if(top==null)
			System.out.println("Stack is empty.");
		else {
			Node temp= top;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
}

