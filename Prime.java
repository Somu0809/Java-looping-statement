package Main;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		boolean a = true;
		
		for(int i =2; i <= num / 2; i++) {
				if(num%i==0) {
					a = false;
					break;
				}
		}
		
		if(a) {
			System.out.println("It is a Prime number");
		}
		else {
			System.out.println("It is Not a prime number");
		}
		
		sc.close();
		
	}

}
