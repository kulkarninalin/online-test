package com.nalin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram_Example {
	
public static void anagramExample() {
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

}

static boolean isAnagram(String str1, String str2) {  
    String s1 = str1.replaceAll("\\s", "");  
    String s2 = str2.replaceAll("\\s", "");  
    
    if (s1.length() != s2.length()) {  
         return false;  
    } else {  
        char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        return Arrays.equals(ArrayS1, ArrayS2);  
    }  
     
    
}



}
