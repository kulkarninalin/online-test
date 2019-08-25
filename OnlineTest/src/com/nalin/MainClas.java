package com.nalin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainClas {
	
	public static void main(String[] args) {
		
		int choice;
		do {
			System.out.println("\n1.Example1\n2.Example2\n3.Example3\n");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:					
				LinkedList_Example.removenthHead();
				break;

			case 2:
				Array_Example.sortExample();				
				break;
				
			case 3:
				Anagram_Example.anagramExample();
				break;
			
			
			default:
				break;
			}
		} while (choice<4);
		
		
	}


	

}
