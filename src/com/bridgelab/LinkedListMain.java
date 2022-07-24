package com.bridgelab;
import java.util.*;


public class LinkedListMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 To add the data at the start"); //UC2
		System.out.println("Enter 2 To add the data at the end"); //UC3
		System.out.println("Enter 3 To add the data at in between "); //UC4
		System.out.println("Enter 4 To delete first element of linkedlist "); //UC5
		System.out.println("Enter 5 To delete last element of linkedlist ");  //UC6
		switch (scanner.nextInt()) {
		case 1:
			Operations.addDataAtStart();
			break;
		case 2:
			Operations.addDataAtEnd();
			break;
		case 3:
			Operations.insertInBetween();
			break;
		case 4:
			Operations.pop();
			break;
		case 5:
			Operations.poplast();
		}
		
	
	}
}


