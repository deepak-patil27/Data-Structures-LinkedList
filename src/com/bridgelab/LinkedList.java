package com.bridgelab;

public class LinkedList {
	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;

	}

	public void append(int data) {
		Node newNode = new Node (data);
		if(head==null) 
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			this.tail.next = newNode;
			tail= newNode;

		}

	}

	public void insertInBetween(Node previousNode ,Node newNode){
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;

	}

	public void pop(){
		head = head.next;
	}

	public void popLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
              //Find Second last node
		Node second_last = head;
		while (second_last.next.next != null)
			second_last = second_last.next;       
		second_last.next = null;     //change next of second last
		
	}


	public void print() {
		if (head == null)
		{
			System.out.println("Linked list is empty");

		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}

		}
	}


}
