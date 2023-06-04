package Doubt_Class_2_Array_1;

import java.util.Scanner;

public class Target_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		
		int target = sc.nextInt();
		TargetSum(arr,target);
	

	}
	
	public static void TargetSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(Math.min(arr[i], arr[j])+"And "+Math.max(arr[i], arr[j]));
				}
			}
		}
	}

}
