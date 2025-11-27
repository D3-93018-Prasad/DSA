package com;
import java.util.* ;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		 System.out.println("Enter a line of text:");
	        String line = sc.nextLine();

	        // Split input line into words
	        String[] words = line.trim().split("\\s+");

	        for (String word : words) {
	            map.put(word, map.getOrDefault(word, 0) + 1);
	        }

	        System.out.println("\nWord frequencies:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	}

}
