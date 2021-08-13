package samples;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isPrime(number));

	}

	private static boolean isPrime(int number) {
		//int factor = 0;
		for(int i=2; i<=Math.sqrt(number);i++) {
			if(number % i == 0)
				return false;
		}

		return true;
	}

}
