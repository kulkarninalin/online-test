package com.nalin;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Example {

	
	public static void removeHead() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Linked List example");
		LinkedList<Integer> link_list=new LinkedList<>();
		System.out.println("How many element you want to add?");
		int size=sc.nextInt();
		for (int i = 0; i < size; i++) {
			int e=sc.nextInt();
			link_list.add(e);
		}
		
		
		System.out.println("Enter node elements which wants to  delete");
		int target_ele=sc.nextInt();
		
		link_list.remove(link_list.size()-target_ele);
		
		//System.out.println(link_list.remove(target_ele-1));
			
		System.out.println("Linked List : "+link_list);
		System.out.println("Head element : "+link_list.peek());

		
	}
}
