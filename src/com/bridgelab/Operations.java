package com.bridgelab;
import java.util.*;

public class Operations {
	public static void addDataAtStart() {
		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();	
		
	}
	
	public static void addDataAtEnd() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
		
	}
	
	public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode= new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println();
        System.out.println("after:");
        linkedList.print();
		
	}
	
	
	public static void pop() {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		System.out.println("Created Linkedlist:");
		linkedlist.print();
		System.out.println("\nDeleted first element in the LinkedList:");
		linkedlist.pop();
		linkedlist.print();
		
	}
	
	
	public static void poplast() {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		System.out.println("Created Linkedlist:");
		linkedlist.print();
		System.out.println("\nDeleted last element in the LinkedList:");
		linkedlist.popLast();
		linkedlist.print();
		
	}

}
