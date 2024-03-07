package Main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for the Fibonacci Series : ");
		int num = sc.nextInt();
		
		int first = 0, sec = 1, neww;
		
		System.out.print("The fibonacci series up to" + " " + num + ":" + " " + first + "," + sec);
		
		while ((neww = first + sec)<= num) {
			System.out.print(","+neww);
			
			first = sec;
			sec = neww;
		}
		
		sc.close();
	}

}
