package com;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input elements
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Create map to count frequency
	        Map<Integer, Integer> freqMap = new HashMap<>();

	        for (int num : arr) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        // Find mode
	        int mode = arr[0];
	        int maxCount = 0;

	        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                mode = entry.getKey();
	            }
	        }

	        // Print result
	        System.out.println("Mode of the array: " + mode);
	        System.out.println("Frequency: " + maxCount);
		

	}

}
