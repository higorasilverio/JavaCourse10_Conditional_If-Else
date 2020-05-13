package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the inicial hour: ");
		int initial = scanner.nextInt();
		System.out.print("Enter the final hour: ");
		int end = scanner.nextInt();
		int duration = end - initial;
		
		if (duration >= 0) {
			System.out.println("Game duration = " + duration + " hour(s)!");
		}
		else {
			duration += 24;
			System.out.println("Game duration = " + duration + " hour(s)!");
		}
		
		scanner.close();		
	}

}
