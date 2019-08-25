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

public class SortingTest {
	
	public static void main(String[] args) {
		
		int choice;
		do {
			System.out.println("\n1.Example1\n2.Example2\n3.Example3\n");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
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
				
				
				
				break;

			case 2:
				System.out.println("Enter the size of array & Elements");

				int size_array=sc.nextInt();
				int[] arr=new int[size_array];
				int[] temp_arr=new int[2];
				for (int i = 0; i < size_array; i++) {
					System.out.println("Enter element value");
					int element=sc.nextInt();
					arr[i]=element;
				}
				System.out.println("Your array value");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				
				
				Arrays.sort(arr);
				System.out.println("sorted array");
				System.out.println("[ ");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println(" ]");

				System.out.println("Enter target value");
				int target=sc.nextInt();
				
				for (int i = 0; i < arr.length; i++) {
					int check_val=Arrays.binarySearch(arr, target);
					int count_occ=countOccurrences(arr,arr.length,target);
					//System.out.println("check value ="+check_val);
					if(check_val < 0 ) {
						temp_arr[0]=-1;
					}else if(count_occ >=2 ){
						temp_arr[0]=check_val;
						temp_arr[1]=check_val+count_occ-1;
					}else {
						System.out.println("target value is single in array");
					}
					
				}
				
				for (int i = 0; i < temp_arr.length; i++) {
					System.out.print(temp_arr[i]+" ");
				}
				
				break;
				
			case 3:
				String[] arr_string= {"eat", "tea", "tan", "ate", "nat", "bat"};
				System.out.println("Anagram Example");
				for (int i = 0; i < arr_string.length; i++) {
					Set<String> temp_result=new HashSet();
					
					for (int j = i+1; j < arr_string.length; j++) {
						
						if(isAnagram(arr_string[i], arr_string[j])) {
							temp_result.add(arr_string[i]);
							temp_result.add(arr_string[j]);
						}
						
					}
					System.out.println(temp_result.size() != 0 ? temp_result:""  );
					System.out.println();
					if(temp_result.contains(arr_string[i])) {
						i++;
					}
				}
			
				break;
			
			
			default:
				break;
			}
		} while (choice<4);
		
		
	}

	static boolean isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            //System.out.println(s1 + " and " + s2 + " are anagrams");
            return true;
        } else {  
            //System.out.println(s1 + " and " + s2 + " are not anagrams");  
            return false;
        }  
        
	}
	
	static int countOccurrences(int arr[], int n, int x) 
    { 
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 
	

}
