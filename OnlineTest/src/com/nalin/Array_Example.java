package com.nalin;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Example {
	
	public static void sortExample() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");

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
