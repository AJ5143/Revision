package samples;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.println(factorial(Number));

	}

	private static int factorial(int number) {
		//ArrayList<Integer> fact = new ArrayList();
		if(number == 0)
			return 1;
		else 
			return number*factorial(number-1);
		
	}

}
