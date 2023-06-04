package Doubt_Class_2_Array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		
		int target = sc.nextInt();
		PairofRoses(arr,target);
	
	}

	private static void PairofRoses(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		

		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		int p1 = 0;
		int p2 = 0;
		int diff = Integer.MAX_VALUE;
		while(i<j) {
			if(arr[i]+arr[j]>target) {
				j--;
			}
			else if(arr[i]+arr[j]<target) {
				i++;
			}
			else {
				if(diff>arr[j]-arr[i]) {
					p1 = arr[i];
					p2 = arr[j];
					diff = arr[j] - arr[i];
				}
				i++;
				j--;
			}
		}
		
		System.out.println("Deepak should buy roses whose prices are "+p1 +" and "+ p2+ ".");
		
	}
	
	
	

}
