package samples;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci Demo!");
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(fibonacci(number));
		sc.close();
		
	}

	private static ArrayList fibonacci(int number) {
		ArrayList<Integer> Fib = new ArrayList();
		Fib.add(0);
		Fib.add(1);
		for(int i=2;i<number;i++) {
			Fib.add(i, Fib.get(i-1) + Fib.get(i-2));
		}
		return Fib;
		
	}

}
