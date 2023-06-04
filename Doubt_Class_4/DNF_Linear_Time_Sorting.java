package Doubt_Class_4_Array_3;

import java.util.Scanner;

public class DNF_Linear_Time_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		dnf(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void dnf(int []arr) {
		int i = 0; // zero ke index ka track
		int j = arr.length-1; //2 ke index ka track
		int k = 0;
		
		while(k<=j) {
			if(arr[k]== 0) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				i++;
				k++;
			}
			
			else if(arr[k]==2) {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j--;
			}
			else {
				k++;
			}
		}
	}

}
