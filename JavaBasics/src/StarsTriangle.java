

import java.util.Scanner;

public class StarsTriangle {
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("press interger n:");
		int n = keyboard.nextInt();
		//System.out.println("n = " + n);
		
		for (int i = 0; i<n; i++) {
			for (int j = n; j>i; j--) {
				System.out.print(" ");	
			}		
			for (int j = 0; (j <= 2*i); j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
