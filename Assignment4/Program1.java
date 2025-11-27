package com;

public class Program1 {
	public static int lastocc(int arr[], int key) {
		int n = arr.length ;
		int ans = -1;
		for(int i = 0; i<n ; i++) {
			if(arr[i] == key) 
				ans = i;
		}
		
		return ans ;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,3,7,7,3,9,8,3,6};
		int key = 0;
		int ans = lastocc(arr,key);
		
		if(ans != -1)
			System.out.println("Index of last occurance of key : " + ans);
		else
			System.out.println("Key not found.");

	}

}
