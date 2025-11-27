package com;

public class Program2 {
	
	public static int lastocc(int arr[], int key,int k) {
		int n = arr.length ;
		int ans = -1;
		int cnt = 0;
		for(int i = 0; i<n ; i++) {
			if(arr[i] == key) {
				ans = i;
				cnt++;
				
				if(cnt == k) return ans;
			}
		}
		
		return -1 ;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,6,3,7,7,3,9,8,3,6};
		int key = 3;
		int nth = 2;
		int ans = lastocc(arr,key, nth);
		
		if(ans != -1)
			System.out.println("Index of last occurance of key : " + ans);
		else
			System.out.println("-1");
		
	}

}
