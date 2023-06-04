package Doubt_Class_1;
import java.util.Scanner;


public class Boston_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		Boston(n);

	}
	
	public static void Boston(int n) {
		int sum1 = sumofd(n);
		int sum2 = 0;
		int i = 2;
		while(i<=n) {
			while(n%i==0) {
				sum2 += sumofd(i);
				n = n/i;
			}
			i++;
		}
		if(sum1==sum2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static int sumofd(int n) {
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum += rem;
			n = n/10;
			
		}
		return sum;
	}

}
