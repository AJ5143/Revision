package samples;

import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(findLCM(a,b));
		sc.close();

	}

	private static int findLCM(int a, int b) {
		int gcd = GCD.findGCD(a, b);
		int result = (a * b) / gcd; 
		return result;
	}

}
