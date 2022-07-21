package com.bridgelab;
import java.util.*;


public class LinkedListMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 To add the data at the start"); //UC1
		System.out.println("Enter 2 To add the data at the end"); //UC2
		switch (scanner.nextInt()) {
		case 1:
			Operations.addDataAtStart();;
			break;
		case 2:
			Operations.addDataAtEnd();
		
		}
	
	}
}


