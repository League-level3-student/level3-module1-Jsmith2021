package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> words = new ArrayList<String>();
		//   Don't forget to import the ArrayList class

		//2. Add five Strings to your list
		words.add("fruits");
		words.add("pineapple");
		words.add("mango");
		words.add("coconut");
		words.add("passionfruit");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < words.size(); i++) {
			String s = words.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		
		
		//4. Print all the Strings using a for-each loop
		for (String s:words) {
		//5. Print only the even numbered elements in the list.
		System.out.println(words.size()-1);
		System.out.println(words.size()-3);
		
		//6. Print all the Strings in reverse order.
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(words.size()-1);
		System.out.println(words.size());
		//7. Print only the Strings that have the letter 'e' in them.
		if(words.equals("e")){
			System.out.println(words);
		}
		}
		}
	}

