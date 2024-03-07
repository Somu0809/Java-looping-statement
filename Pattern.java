package Main;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r = sc.nextInt();
		
		for (int i = r; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print(" " + "@" + " ");
				
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
