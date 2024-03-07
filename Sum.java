package Main;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num = sc.nextInt();
		
		int a = 0;
		
		while(num != 0) {
			a += num % 10;
			num /= 10;
		}
		
		System.out.println(a);
		
		sc.close();
		
	}

}
